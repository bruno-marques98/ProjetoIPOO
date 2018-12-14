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
public enum ClassroomType {
    THEORY, PRACTICAL, LAB, TUTORIALS;

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
                return str ="";
        }
    }
   
}
