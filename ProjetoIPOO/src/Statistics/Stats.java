/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statistics;

import Program.Viewer;
import classes.Agender;
import classes.ClassType;
import classes.Evaluation;
import classes.EvaluationType;
import classes.Schedule;
import classes.Student;
import classes.UC;
import java.time.LocalDateTime;

/**
 *
 * @author bruno
 */
public class Stats {
    private Viewer viewer;

    public Stats(Viewer viwer) {
        this.viewer = viwer;
    }
    
    public int hoursByClassesType(ClassType type){
        int totalHours = 0;
        switch(type){
            case THEORY:
                totalHours += viewer.numberOfHoursClassType(type);
                break;
            case PRACTICAL:
                totalHours += viewer.numberOfHoursClassType(type);
                break;
            case LAB:
                totalHours += viewer.numberOfHoursClassType(type); 
                break;
            default:
                return 0;
        }
        return totalHours;
    }
        
    public int hoursByEvaluationType(EvaluationType type){
        int totalHours = 0;
        switch(type){
            case TEST:
                totalHours += viewer.numberOfHoursEvaluationType(type);
                break;
            case EXAM:
                totalHours += viewer.numberOfHoursEvaluationType(type);
                break;
            case PRESENTATION:
                totalHours += viewer.numberOfHoursEvaluationType(type);   
                break;
            case PROJECT:
                totalHours += viewer.numberOfHoursEvaluationType(type);   
                break;
            default:
                return 0;
        }
        return totalHours;
    }
    public int hoursOfEvaluations(){
        int totalEvaluations = 0;
        for(UC uc : viewer.getUCs()){
            for(Evaluation e : viewer.getEvaluations(uc)){
                totalEvaluations++;
            }
        }
        return totalEvaluations;
    }
    public int evaluationsToDo(){
        int totalEvaluations = 0;
        for(UC uc : viewer.getUCs()){
            for(Evaluation e : viewer.getEvaluations(uc)){
                if(e.getDate().compareTo(LocalDateTime.now())> 0){
                    totalEvaluations++;
                }
            }
        }
        return totalEvaluations;
    }
    public int classesTillEnd(){
        int count = 0;
        for(Schedule s : viewer.getAgender().getSchedules()){
            if(s.getEnding().compareTo(LocalDateTime.now())>0){
                count++;
            }
        }
        return count;
    }
    public int totalCredits(){
        int credits =0;
        for(UC uc : viewer.getAgender().getUcs()){
            credits += uc.getNumberOfCredits();
        }
        return credits;
    }
    public double averageHoursPerWeek(){
        double totalHours = 0;
        int weeks = viewer.getAgender().getNumberWeeks();
        for(int i = 0; i < weeks;i++){
            for(Schedule s : viewer.getWeekSchedule(0)){
                totalHours += s.getDuration();
            }
        }
        return totalHours / weeks;        
    }
    public double classesHours(Student std){
        int totalClasses = 0;
        int totalSemesters = 0;
        for(Agender a : std.getAgender()){
            totalSemesters++;
            for(UC uc : a.getUcs()){
                totalClasses++;
            }
        }
        return totalClasses/totalSemesters;
    }    
}
