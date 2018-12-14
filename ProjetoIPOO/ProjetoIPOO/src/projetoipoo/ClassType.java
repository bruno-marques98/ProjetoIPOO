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
public enum ClassType {
    THEORY, PRACTICAL, LAB;
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
