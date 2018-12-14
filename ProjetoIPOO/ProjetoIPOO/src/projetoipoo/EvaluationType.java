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
public enum EvaluationType {
    TEST, EXAM, PRESENTATION, PROJECT;
    
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
