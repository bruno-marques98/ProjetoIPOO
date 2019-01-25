/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statistics;

import Program.Visualizer;
import classes.ClassType;
import classes.EvaluationType;

/**
 *
 * @author bruno
 */
public class Stats {
    private Visualizer viewer;

    public Stats(Visualizer viwer) {
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
        }
        return totalHours;
    }
    
    
}
