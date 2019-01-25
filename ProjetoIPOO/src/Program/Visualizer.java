/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import classes.Classroom;
import classes.Evaluation;
import classes.Group;
import classes.Instructor;
import classes.Student;
import classes.Agender;
import classes.ClassDurationType;
import classes.ClassType;
import classes.EvaluationType;
import classes.Schedule;
import classes.UC;
import classes.UCClass;
import java.util.ArrayList;


/**
 *
 * @author bruno_170221059 Gonçalo_180221046
 */
public class Visualizer {
    private ArrayList<Instructor> instructors;
    private ArrayList<Student> students;
    private ArrayList<Classroom> classrooms;
    private ArrayList<Evaluation> evaluations;
    private Agender agender;


    public Visualizer(ArrayList<Instructor> instructors,ArrayList<Student> students,ArrayList<Classroom> classrooms,ArrayList<Evaluation> evaluations, Agender agender) {
        this.instructors = instructors;
        this.students = students;
        this.classrooms = classrooms;
        this.evaluations = evaluations;
        this.agender = agender;
    }
    
        /**
     * Permite ver os grupos de um estudante
     * @param studentNumber
     * @param groups
     */
    public void showGroups(int studentNumber, ArrayList<Group> groups){
        groups.stream().filter((group) -> (group.containsStudent(studentNumber))).forEachOrdered((group) -> {
            group.toString();
        });
    }
    /**
     * Permite obter o horário de uma semana
     * @param numberOfWeek
     * @return schedule
     */    
    public ArrayList<Schedule> getWeekSchedule(int numberOfWeek){
        LocalDate date = agender.getStartSemester().plusDays(numberOfWeek*7); 
        int firstDayOkWeek = date.getDayOfMonth();
        ArrayList<Schedule> schds = new ArrayList<>();
        for (Schedule schedule : agender.getSchedules()) {
            if (schedule.getBeginning().toLocalDate().compareTo(date) > 0 && schedule.getBeginning().toLocalDate().compareTo(date.plusDays(7)) < 0) {
                schds.add(schedule);
            }
        }
        return schds; 
    }
    /**
     * Permite obter o horário de um dia
     * @param dayOfMonth
     * @param month
     * @return schedule
     */ 
    public ArrayList<Schedule> getDaySchedule(int dayOfMonth, int month){
        ArrayList<Schedule> schd = new ArrayList<>();
        for (Schedule schedule : agender.getSchedules()) {
            if (schedule.getBeginning().getMonthValue() == month && schedule.getBeginning().getDayOfMonth() == dayOfMonth) {
                schd.add(schedule);
            }
        }
        return schd;
    }
    /**
     * Permite obter as avaliações de uma UC
     * @param uc
     * @return evaluations
     */ 
    public ArrayList<Evaluation> getEvaluations(UC uc){
        ArrayList<Evaluation> evaluations = new ArrayList<>();
        for(UC uC : agender.getUcs()){
            if(uC.getId() == uc.getId()){
                for(Evaluation evaluation : uC.getEvaluation().keySet()){
                    if(evaluation.getDate().compareTo(LocalDateTime.now())>=0){
                        evaluations.add(evaluation);
                    }
                }
                
            }
        }
        return evaluations;
    }
    /**
     * Permite obter o horário de uma semana
     * @param ucId 
     * @return schedule
     */ 
    public ArrayList<Schedule> getInstructorsSchedule(String ucId){
        ArrayList<Schedule> schd = new ArrayList<>();
        for(UC uc : agender.getUcs()){
            if(uc.getId().compareTo(ucId) == 0){
                for(Instructor ins : instructors){
                    for(Schedule sc : ins.getSchedule()){
                        schd.add(sc);
                    }
                }   
            }
        }
        return schd;
    }  
    /**
     * Permite obter as aulas de uma sala
     * @param classroomName
     * @return UCClasses
     */ 
    public ArrayList<UCClass> getClasses(String classroomName){
        ArrayList<UCClass> ucClasses = new ArrayList<>();
        for(UC uc : agender.getUcs()){
            for(UCClass ucClass : uc.getClasses()){
                if(ucClass.getRoom().getName().compareTo(classroomName)==0){
                    ucClasses.add(ucClass);
                }
            }
        }
        return ucClasses;
    }
    /**
     * Permite obter as UCs
     * @return UCs
     */ 
    public ArrayList<UC> getUCs(){
        ArrayList<UC> ucs = new ArrayList<>();
        for(UC ucss : agender.getUcs()){
            for(UCClass ucClasses: ucss.getClasses()){
                if(ucClasses.getEndClass().toLocalDate().compareTo(agender.getEndSemester())<0){
                    ucs.add(ucss);
                }
            }
        }
        return ucs;
    }
    public int numberOfHoursClassType(ClassType type){
        int total = 0;
        for(UC ucs : agender.getUcs()){
            for(UCClass ucClasses : ucs.getClasses()){
                if(ucClasses.getClassroomType().equals(type)){
                    total+=(ucClasses.minutesDuration()/60);
                }
            }
        }
        return total;
    }
    public int numberOfHoursEvaluationType(EvaluationType type){
        int total = 0;
        for(Evaluation eval : evaluations){
            if(eval.getType().equals(type)){
                total+=type.getDuration();
            }
        }
        return total;
    }
}
