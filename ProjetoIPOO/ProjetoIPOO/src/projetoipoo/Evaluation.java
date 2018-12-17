/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 *
 * @author bruno
 */
public class Evaluation {
    private EvaluationType type;
    private String description;
    private Classroom classroom;
    public Evaluation(EvaluationType type) {
        this.type = type;
    }

    public Evaluation(EvaluationType type, String description, Classroom classroom) {
        this.type = type;
        this.description = description;
        this.classroom = classroom;
    }
    
    public void addDescription(String description){
        this.description = description;  
    }
}
