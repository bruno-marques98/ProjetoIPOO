/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public Agender(LocalDateTime startSemester, LocalDateTime endSemester, boolean isSemesterPar) {
        this.startSemester = startSemester;
        this.endSemester = endSemester;
        this.isSemesterPar = isSemesterPar;
        ucs = new UC[10];
        instructors = new Instructor[10];
        groups = new Group[10];
    }

    public LocalDateTime getStartSemester() {
        return startSemester;
    }

    public LocalDateTime getEndSemester() {
        return endSemester;
    }

    public boolean isIsSemesterPar() {
        return isSemesterPar;
    }

    public UC[] getUcs() {
        return ucs;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setStartSemester(LocalDateTime startSemester) {
        if(startSemester!=null) this.startSemester = startSemester;
    }

    public void setEndSemester(LocalDateTime endSemester) {
        if(endSemester!=null)this.endSemester = endSemester;
    }

    public void setIsSemesterPar(boolean isSemesterPar) {
        this.isSemesterPar = isSemesterPar;
    }
    
    public void setGroup(Group[] groups){
        if(groups != null){
            this.groups = groups;
        }
    }
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
    public boolean addGroup(Group group){
        if(group != null){
            for (int i = 0; i < groups.length; i++) {
                 groups[i] = group;
                 return true;
                
            }
        }
        return false;
    }
    public void showGroup(){
        for(int i = 0; i < groups.length; i++){
            if(groups[i] != null){
                System.out.println(groups[i].toString());
            }
        }
    }
    
    public int totalCredits(){
        int totalCredits = 0;
        for(UC uc: ucs){
            if(uc != null)
                totalCredits += uc.getNumberOfCredits();
        }
        return totalCredits;
    }
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
    
    public void avaliations(){
        //Do avaliations
    }
}
