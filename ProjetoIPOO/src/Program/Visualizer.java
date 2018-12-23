/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import projetoipoo.Classroom;
import projetoipoo.Evaluation;
import projetoipoo.Group;
import projetoipoo.Instructor;
import projetoipoo.Student;
import projetoipoo.Agender;
import projetoipoo.Class;
import projetoipoo.ClassDurationType;
import projetoipoo.ClassType;
import projetoipoo.Schedule;
import projetoipoo.UC;
import projetoipoo.UCClass;


/**
 *
 * @author bruno
 */
public class Visualizer {
    private Instructor[] instructors;
    private Student[] students;
    private Classroom[] classrooms;
    private Evaluation[] evaluations;
    private Agender agender;


    public Visualizer(Instructor[] instructors, Student[] students, Classroom[] classrooms, Evaluation[] evaluations, Agender agender) {
        this.instructors = instructors;
        this.students = students;
        this.classrooms = classrooms;
        this.evaluations = evaluations;
        this.agender = agender;
    }
    
    
    public void showGroups(int studentNumber, Group[] groups){
         for(Group group : groups){
             if(group.containsStudent(studentNumber)){
                 group.toString();
             }
         }
    }
    
    
        public Schedule[] getWeekSchedule(int numberOfWeek){
        LocalDate date = agender.getStartSemester().plusDays(numberOfWeek*7); 
        int firstDayOkWeek = date.getDayOfMonth();
        Schedule[] schds = new Schedule[20];
        for (Schedule schedule : agender.getSchedules()) {
            if (schedule.getBeginning().toLocalDate().compareTo(date) > 0 && schedule.getBeginning().toLocalDate().compareTo(date.plusDays(7)) < 0) {
                for (int j = 0; j < schds.length; j++) {
                    if (schds[j] == null) {
                        schds[j] = schedule;
                    }
                }
            }
        }
        return schds; 
    }
    
    public Schedule[] getDaySchedule(int dayOfMonth, int month){
        Schedule[] schd = new Schedule[10];
        for (Schedule schedule : agender.getSchedules()) {
            if (schedule.getBeginning().getMonthValue() == month && schedule.getBeginning().getDayOfMonth() == dayOfMonth) {
                for (int j = 0; j < schd.length; j++) {
                    if (schd[j] == null) {
                        schd[j] = schedule;
                    }
                }
            }
        }
        return schd;
    }
    
    public Evaluation[] getEvaluations(UC uc){
        Evaluation[] evaluations = new Evaluation[10];
        for(UC uC : agender.getUcs()){
            if(uC.getId() == uc.getId()){
                for(Evaluation evaluation : uC.getEvaluation()){
                    if(evaluation.getDate().compareTo(LocalDateTime.now())>=0){
                        for(int i = 0; i < evaluations.length; i++){
                            if(evaluations[i]!=null){
                                evaluations[i] = evaluation;
                            }
                        }
                    }
                }
                
            }
        }
        return evaluations;
    }
    
    public Schedule[] getInstructorsSchedule(String ucId){
        Schedule[] schd = new Schedule[20];
        for(UC uc : agender.getUcs()){
            if(uc.getId().compareTo(ucId) == 0){
                for(int i = 0; i < instructors.length; i++){
                    if(instructors[i].getSchedule() != null){
                        schd = instructors[i].getSchedule();
                    }
                }
            }
        }
        return schd;
    }  
    public UCClass[] getClasses(String classroomName){
        UCClass[] ucClasses = new UCClass[20]; 
        for(UC uc : agender.getUcs()){
            for(UCClass ucClass : uc.getClasses()){
                if(ucClass.getRoom().getName().compareTo(classroomName)==0){
                    for(int i = 0; i < ucClasses.length ; i++){
                        if(ucClasses[i] != null){
                              ucClasses[i] = ucClass;
                        }
                    }
                }
            }
        }
        return ucClasses;
    }
    public UC[] getUCs(){
        UC[] ucs = new UC[20];
        for(UC ucss : agender.getUcs()){
            for(UCClass ucClasses: ucss.getClasses()){
                if(ucClasses.getEndClass().toLocalDate().compareTo(agender.getEndSemester())<0){
                    for(int i = 0; i < ucs.length; i++){
                        if(ucs[i] != null){
                            ucs[i] = ucss;
                        }
                    }
                }
            }
        }
        return ucs;
    }
}
