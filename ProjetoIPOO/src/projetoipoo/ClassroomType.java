/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe ClassroomType implemneta o tipo da sala de aula
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public enum ClassroomType {
    THEORY, PRACTICAL, LAB, TUTORIALS;

    /**
     * Permite obter o tipo da sala de aula consoante as escolhas efetuados pelo utilizador
     * @return cadeia de caractéres com o tipo da sala de aula
     */
    @Override
    public String toString() {
        String str = "" ;
        switch(this){
            case THEORY:
                return str+= " theory";
            case PRACTICAL:
                return str+= " practical";
            case LAB:
                return str+= " lab";
            case TUTORIALS:
                return str+= " tutorials";
            default:
                return str;
        }
    }
   
}
