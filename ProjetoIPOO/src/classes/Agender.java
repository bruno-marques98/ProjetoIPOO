/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.WEEKS;
import java.util.ArrayList;
import java.util.Objects;

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
    private ArrayList<UC> ucs;
    private ArrayList<Instructor> instructors;
    private ArrayList<Group> groups;
    private ArrayList<Schedule> schedules;

    /**
     * Construtor da classe Agender que permite criar uma agenda com uma data do inicio e fim do semestre
     * @param startSemester
     * @param endSemester
     * @param isSemesterPar
     */
    public Agender(LocalDate startSemester, LocalDate endSemester, boolean isSemesterPar) {
        this.startSemester = startSemester;
        this.endSemester = endSemester;
        this.isSemesterPar = isSemesterPar;
        this.ucs = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.schedules = new ArrayList<>();
    }

    /**
     * Permite obter a data do incio do semestre
     * @return data do incio
     */
    public LocalDate getStartSemester() {
        return startSemester;
    }

    /**
     * Permite modificar a data de inicio do semestre
     * @param startSemester
     */
    public void setStartSemester(LocalDate startSemester) {
        this.startSemester = startSemester;
    }

    /**
     * Permite obter a data do final do semestre
     * @return data do final
     */
    public LocalDate getEndSemester() {
        return endSemester;
    }

    /**
     * Permite modificar a data do final do semestre
     * @param endSemester
     */
    public void setEndSemester(LocalDate endSemester) {
        this.endSemester = endSemester;
    }

    /**
     * Permite obter se o semestre é par ou não
     * @return true se for par / false se não
     */
    public boolean isIsSemesterPar() {
        return isSemesterPar;
    }

    /**
     * Permite modificar o estado do semestre(se é par ou não)
     * @param isSemesterPar
     */
    public void setIsSemesterPar(boolean isSemesterPar) {
        this.isSemesterPar = isSemesterPar;
    }

    /**
     * Permite obter a lista de ucs
     * @return lista de ucs
     */
    public ArrayList<UC> getUcs() {
        return ucs;
    }

    /**
     * Permite modificar a lista de ucs
     * @param ucs
     */
    public void setUcs(ArrayList<UC> ucs) {
        this.ucs = ucs;
    }

    /**
     * Permite obter a lista de docentes
     * @return lista de docentes
     */
    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    /**
     * Permite modificar a lista de docentes
     * @param instructors
     */
    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    /**
     * Permite obter a lista de grupos
     * @return lista de grupos
     */
    public ArrayList<Group> getGroups() {
        return groups;
    }

    /**
     * Permite modificar a lista de grupos
     * @param groups
     */
    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    /**
     * Permite obter a lista de horários
     * @return lista de horários
     */
    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * Permite modificar a lista de horários
     * @param schedules
     */
    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }


    /**
     * Permite adicionar uma unidade curricular à coleção de unidades curriculares já existente
     * @param uc
     * @return true se for possivel adicionar uma unidade curricular, adicionando a mesma / false se não for possivel adicionar
     */
    public boolean addUC(UC uc){
        if(uc!=null){
            ucs.add(uc);
            return true;
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
            groups.add(group);
            return true;
        }
        return false;
    }

    /**
     * Permite adicionar um instrutor
     * @param ins
     * @return true se conseguiu adicionar / false se não
     */
    public boolean addInstructor(Instructor ins){
        if(ins != null){
            instructors.add(ins);
            return true;
        }
        return false;
    }

    /**
     * Permite adicionar um horário
     * @param sch
     * @return true se conseguiu adicionar / false se não
     */
    public boolean addSchedule(Schedule sch){
        if(sch!=null){
            schedules.add(sch);
            return true;
        }
        return false;
    }
    /**
     * Mostra no ecrã uma mensagem com a coleção dos grupos
     */
    public void showGroup(){
        groups.forEach((group) -> {
            System.out.println(group.toString());
        });
    }
    
    /**
     * Permite obter o total de créditos de todas as unidades curriculares existentes
     * @return total dos creditos
     */
    public int totalCredits(){
        int totalCredits = 0;
        totalCredits = ucs.stream().filter((uc) -> (uc != null)).map((uc) -> uc.getNumberOfCredits()).reduce(totalCredits, Integer::sum);
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
         double totalHours = (double) totalMinutes / 60;
         return totalHours;
    }

    /**
     * Permite obter uma lista de avalições
     * @return lista de avaliações
     */
    public ArrayList<Evaluation> evaluation(){
        ArrayList<Evaluation> evaluations = new ArrayList<>();
        for(UC uc : ucs){
            for(Evaluation evaluation: uc.getEvaluation().keySet()){
                 evaluations.add(evaluation);
            }
        }
        return evaluations;
    }
    
    /**
     * Permite obter o número de semanas por semestre
     * @return número de semanas
     */
    public int getNumberWeeks(){
        long weeksBetween = WEEKS.between(startSemester,endSemester);
        return (int)weeksBetween;
    }
    
    /**
     * Permite modificar o horário da semana
     * @param schedule
     * @return true se for possivel modificar / false se não
     */
    public boolean setClassEveryWeek(Schedule schedule){
        for(int i = 0;i< getNumberWeeks(); i++){
            if(schedules.get(i) != null){
                schedules.add(i,new Schedule(schedule.getBeginning().plusDays(7),schedule.getEnding()));
                return true;
            }
        }
        return false;
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.startSemester.hashCode();
        hash = 29 * hash + this.endSemester.hashCode();
        hash = 29 * hash + (this.isSemesterPar ? 1 : 0);
        hash = 29 * hash + this.ucs.size();
        hash = 29 * hash + this.instructors.size();
        hash = 29 * hash + this.groups.size();
        hash = 29 * hash + this.schedules.size();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agender other = (Agender) obj;
        if (this.isSemesterPar != other.isSemesterPar) {
            return false;
        }
        if (!Objects.equals(this.startSemester, other.startSemester)) {
            return false;
        }
        if (!Objects.equals(this.endSemester, other.endSemester)) {
            return false;
        }
        if (!Objects.equals(this.ucs, other.ucs)) {
            return false;
        }
        if (!Objects.equals(this.instructors, other.instructors)) {
            return false;
        }
        if (!Objects.equals(this.groups, other.groups)) {
            return false;
        }
        if (!Objects.equals(this.schedules, other.schedules)) {
            return false;
        }
        return true;
    }

    /**
     * Retorna uma cadeia de caractéres com a informação sobre a agenda
     * @return cadeia de caractéres
     */
    @Override
    public String toString() {
        String str = "";
        str+="Agender"
                + "\nDate of begining of semester: " + startSemester
                + "\nDate of ending of semester: " + endSemester ;
        if(isSemesterPar){
            str+="\nThe semester is even";
        }else{
            str+="\nThe semester is not even";
        }
        return str;
    }
    
}
