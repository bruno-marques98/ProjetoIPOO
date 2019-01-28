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
 * A classe Stats permite visualizar um conjunto de estatísticas sobre os compromissos
 * @author bruno
 */
public class Stats {
    private Viewer viewer;

    /**
     * Construtor da classe Stats
     * @param viwer
     */
    public Stats(Viewer viwer) {
        this.viewer = viwer;
    }
    
    /**
     * Permite obter o número total de horas de uma aula pelo seu tipo
     * @param type
     * @return totalHours
     */
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
        
    /**
     *
     * @param type
     * @return
     */
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

    /**
     * Permite obter o número total de horas das avaliações
     * @return totalEvaluations
     */
    public int hoursOfEvaluations(){
        int totalEvaluations = 0;
        for(UC uc : viewer.getUCs()){
            totalEvaluations = viewer.getEvaluations(uc).stream().map((_item) -> 1).reduce(totalEvaluations, Integer::sum);
        }
        return totalEvaluations;
    }

    /**
     * Permite obter o número de avaliações que ainda estam por fazer
     * @return totalEvaluations
     */
    public int evaluationsToDo(){
        int totalEvaluations = 0;
        for(UC uc : viewer.getUCs()){
            totalEvaluations = viewer.getEvaluations(uc).stream().filter((e) -> (e.getDate().compareTo(LocalDateTime.now())> 0)).map((_item) -> 1).reduce(totalEvaluations, Integer::sum);
        }
        return totalEvaluations;
    }

    /**
     *
     * @return
     */
    public int classesTillEnd(){
        int count = 0;
        count = viewer.getAgender().getSchedules().stream().filter((s) -> (s.getEnding().compareTo(LocalDateTime.now())>0)).map((_item) -> 1).reduce(count, Integer::sum);
        return count;
    }

    /**
     * Permite obter o número total de créditos de todas as ucs
     * @return credits
     */
    public int totalCredits(){
        int credits =0;
        for(UC uc : viewer.getAgender().getUcs()){
            credits += uc.getNumberOfCredits();
        }
        return credits;
    }

    /**
     * Permite obter a média do tempo de duração das aulas por semana
     * @return média 
     */
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

    /**
     * Permite obter o número médio de aulas por semestre de um aluno
     * @param std
     * @return número médio de aulas por semestre
     */
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
