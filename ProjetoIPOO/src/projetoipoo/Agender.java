/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.WEEKS;

/**
 *
 * @author bruno
 */
public class Agender {
    private LocalDateTime startSemester;
    private LocalDateTime endSemester;
    private boolean isSemesterPar;
    private UC[] ucs;
    private Instructor[] instructors;
    private Group[] groups;
    private Schedule[] schedules;

    /**
     *
     * @param startSemester
     * @param endSemester
     * @param isSemesterPar
     */
    public Agender(LocalDateTime startSemester, LocalDateTime endSemester, boolean isSemesterPar) {
        this.startSemester = startSemester;
        this.endSemester = endSemester;
        this.isSemesterPar = isSemesterPar;
        ucs = new UC[10];
        instructors = new Instructor[10];
        groups = new Group[10];
        schedules = new Schedule[7];
    }

    /**
     *
     * @return
     */
    public LocalDateTime getStartSemester() {
        return startSemester;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getEndSemester() {
        return endSemester;
    }

    /**
     *
     * @return
     */
    public boolean isIsSemesterPar() {
        return isSemesterPar;
    }

    /**
     *
     * @return
     */
    public UC[] getUcs() {
        return ucs;
    }

    /**
     *
     * @return
     */
    public Instructor[] getInstructors() {
        return instructors;
    }

    /**
     *
     * @return
     */
    public Group[] getGroups() {
        return groups;
    }

    /**
     *
     * @param startSemester
     */
    public void setStartSemester(LocalDateTime startSemester) {
        if(startSemester!=null) this.startSemester = startSemester;
    }

    /**
     *
     * @param endSemester
     */
    public void setEndSemester(LocalDateTime endSemester) {
        if(endSemester!=null)this.endSemester = endSemester;
    }

    /**
     *
     * @param isSemesterPar
     */
    public void setIsSemesterPar(boolean isSemesterPar) {
        this.isSemesterPar = isSemesterPar;
    }
    
    /**
     *
     * @param groups
     */
    public void setGroup(Group[] groups){
        if(groups != null){
            this.groups = groups;
        }
    }

    /**
     *
     * @param uc
     * @return
     */
    public boolean addUC(UC uc){
        if(uc!=null){
            for(int i = 0; i < ucs.length; i++){
                if(ucs[i] == null){
                    ucs[i] = uc;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param group
     * @return
     */
    public boolean addGroup(Group group){
        if(group != null){
            for (int i = 0; i < groups.length; i++) {
                 groups[i] = group;
                 return true;
                
            }
        }
        return false;
    }

    /**
     *
     */
    public void showGroup(){
        for(int i = 0; i < groups.length; i++){
            if(groups[i] != null){
                System.out.println(groups[i].toString());
            }
        }
    }
    
    /**
     *
     * @return
     */
    public int totalCredits(){
        int totalCredits = 0;
        for(UC uc: ucs){
            if(uc != null)
                totalCredits += uc.getNumberOfCredits();
        }
        return totalCredits;
    }

    /**
     *
     * @return
     */
    public double totalHours(){
        long totalMinutes=0;
         for(UC uc: ucs){
            if(uc != null){
                for(UCClass ucc: uc.getClasses()){
                    if(ucc != null){
                        totalMinutes += ucc.minutesDuration();
                    }
                }
            }
         }
         double totalHours = totalMinutes / 60;
         return totalHours;
    }
    public Evaluation[] evaluation(){
        Evaluation[] evaluations = new Evaluation[ucs.length];
        for(int i = 0; i < ucs.length ; i++){
            evaluations[i] = ucs[i].getEvaluation();
        }
        return evaluations;
    }
    
    public int getWeeks(){
        long weeksBetween = WEEKS.between(startSemester,endSemester);
        return (int) weeksBetween;
    }
    
    public void setClassEveryWeek(Schedule schedule){
        for(Schedule sch : schedules){
            if(sch.equals(schedule)){
                 for(int i = 0;i< getWeeks(); i++){
                     if(schedules[i] != null){
                         schedules[i] = new Schedule(schedule.getBeginning().plusDays(7),schedule.getDuration());
                     }
                }
            }
        }
       
    }
    
}
