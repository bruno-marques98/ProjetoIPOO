/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe ClassType implementa o tipo de aula
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public enum ClassType {
    THEORY, PRACTICAL, LAB;

    /**
     * Permite obter o tipo de aula consoante as escolhas efetuados pelo utilizador
     * @return cadeia de caractéres com o tipo da aula
     */
    @Override
    public String toString() {
        switch(this){
            case THEORY:
                return " theory";
            case PRACTICAL:
                return " practical";
            case LAB:
                return " lab";
            default:
                return "";
        }
    }
}
