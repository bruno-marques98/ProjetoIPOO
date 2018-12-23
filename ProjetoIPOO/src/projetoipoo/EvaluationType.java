/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe EvaluationType implementa um tipo de avaliação
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public enum EvaluationType {
    TEST, EXAM, PRESENTATION, PROJECT;
    
    /**
     * Permite obter o tipo de avaliação, numa cadeia de caractéres
     * @return tipo de avaliação
     */
    @Override
    public String toString() {
        switch(this){
            case TEST:
                return " Test";
            case EXAM:
                return " Exam";
            case PRESENTATION:
                return " Presentation";
            case PROJECT:
                return " Project delivery";
            default:
                return "";
        }
    }
}
