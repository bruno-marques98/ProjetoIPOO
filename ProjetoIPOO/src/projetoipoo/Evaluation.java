/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDateTime;

/**
 * A classe Evaluation implementa uma avaliação
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Evaluation {
    private EvaluationType type;
    private String description;
    private Classroom classroom;

    /**
     * Construtor que cria uma avaliação com um determinado tipo
     * @param type
     */
    private LocalDateTime date;
    public Evaluation(EvaluationType type) {
        this.type = type;
    }

    /**
     * Construtor que cria uma avaliação
     * @param type
     * @param description
     * @param classroom
     */
    public Evaluation(EvaluationType type, String description, Classroom classroom) {
        this.type = type;
        this.description = description;
        this.classroom = classroom;
        this.date = LocalDateTime.now();
    }
    
    /**
     * Permite adicionar uma descrição
     * @param description
     */
    public void addDescription(String description){
        this.description = description;  
    }

    public LocalDateTime getDate() {
        return date;
    }
    
}
