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
 * Agender implementa uma agenda de um aluno para cada semestre
 * Esta classe utiliza a classe LocalDateTime para indicar o inicio e o fim do semestre e uma coleção de unidades corriulares e uma coleção de grupos
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Agender {
    private LocalDate startSemester;
    private LocalDate endSemester;
    private boolean isSemesterPar;
    private UC[] ucs;
    private Instructor[] instructors;
    private Group[] groups;
    private Schedule[] schedules;

    /**
     * Construtor da classe Agender que permite criar uma agenda com uma data do inicio e fim do semestre
     * @param startSemester
     * @param endSemester
     * @param isSemesterPar
     */
    public Agender(LocalDate startSemester, LocalDate endSemester, boolean isSemesterPar, UC[] ucs, Instructor[] instructors, Group[] groups, Schedule[] schedules) {
        this.startSemester = startSemester;
        this.endSemester = endSemester;
        this.isSemesterPar = isSemesterPar;
        this.ucs = ucs;
        this.instructors = instructors;
        this.groups = groups;
        this.schedules = schedules;
    }

    public Agender(LocalDate startSemester, LocalDate endSemester, boolean isSemesterPar) {
        this.startSemester = startSemester;
        this.endSemester = endSemester;
        this.isSemesterPar = isSemesterPar;
    }
    
    

    public Schedule[] getSchedules() {
        return schedules;
    }
    
    /**
     * Permite obter a data do inicio do semestre
     * @return data do inico do semestre
     */
    public LocalDate getStartSemester() {
        return startSemester;
    }

    /**
     * Permite obter a data do fim do semestre
     * @return data do fim do semestre
     */
    public LocalDate getEndSemester() {
        return endSemester;
    }

    /**
     * Permite obter se o semestre é par ou impar
     * @return true se o semestre for par / false se este for impar
     */
    public boolean isIsSemesterPar() {
        return isSemesterPar;
    }

    /**
     * Permite obter a lista de unidades curriculares na agenda do aluno
     * @return ucs
     */
    public UC[] getUcs() {
        return ucs;
    }

    /**
     * Permite obter a lista de docentes que são responsáveis por lecionar as unidades curriculares do aluno
     * @return docentes
     */
    public Instructor[] getInstructors() {
        return instructors;
    }

    /**
     * Permite obter a lista de grupos em que os alunos participam
     * @return
     */
    public Group[] getGroups() {
        return groups;
    }

    /**
     * Permite definir uma nova data para o inicio do semestre
     * @param startSemester
     */
    public void setStartSemester(LocalDate startSemester) {
        if(startSemester!=null) this.startSemester = startSemester;
    }

    /**
     * Permite definir uma nova data para o fim do semestre
     * @param endSemester
     */
    public void setEndSemester(LocalDate endSemester) {
        if(endSemester!=null)this.endSemester = endSemester;
    }

    /**
     *  Permite modificar a paridade do semestre
     * @param isSemesterPar
     */
    public void setIsSemesterPar(boolean isSemesterPar) {
        this.isSemesterPar = isSemesterPar;
    }
    
    /**
     * Permite modificar uma nova coleção de grupos
     * @param groups
     */
    public void setGroup(Group[] groups){
        if(groups != null){
            this.groups = groups;
        }
    }

    /**
     * Permite adicionar uma unidade curricular à coleção de unidades curriculares já existente
     * @param uc
     * @return true se for possivel adicionar uma unidade curricular, adicionando a mesma / false se não for possivel adicionar
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
     * Permite adicionar um grupo à coleção de grupos já existente
     * @param group
     * @return true se for possivel adicionar um grupo / false se não for possivel
     */
    public boolean addGroup(Group group){
        if(group != null){
            for (int i = 0; i < groups.length; i++) {
                if(groups[i] != null){
                    groups[i] = group;
                    return true;  
                }
                 
                
            }
        }
        return false;
    }
    public boolean addInstructor(Instructor ins){
        if(ins != null){
            for (int i = 0; i < instructors.length; i++) {
                if(instructors[i] != null){
                    instructors[i] = ins;
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Mostra no ecrã uma mensagem com a coleção dos grupos
     */
    public void showGroup(){
        for(int i = 0; i < groups.length; i++){
            if(groups[i] != null){
                System.out.println(groups[i].toString());
            }
        }
    }
    
    /**
     * Permite obter o total de créditos de todas as unidades curriculares existentes
     * @return total dos creditos
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
     * Permite obter o número total de horas de todas as unidades curriculares existentes
     * @return total de horas
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
            for(Evaluation evaluation: ucs[i].getEvaluation()){
                 evaluations[i] = evaluation;
            }
               
        }
        return evaluations;
    }
    
    public int getNumberWeeks(){
        long weeksBetween = WEEKS.between(startSemester,endSemester);
        return (int) weeksBetween;
    }
    
    public void setClassEveryWeek(Schedule schedule){
        for(Schedule sch : schedules){
            if(sch.equals(schedule)){
                 for(int i = 0;i< getNumberWeeks(); i++){
                     if(schedules[i] != null){
                         schedules[i] = new Schedule(schedule.getBeginning().plusDays(7),schedule.getEnding());
                     }
                }
            }
        }
       
    }
    

}
