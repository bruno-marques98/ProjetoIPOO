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
public enum ClassDurationType {
    HOUR, HOUR_AND_HALF, TWO_HOURS, FOUR_HOURS;
    
    public double getDuration(){
        switch(this){
            case HOUR:
                return 1.0;
            case HOUR_AND_HALF:
                return 1.5;
            case TWO_HOURS:
                return 2;
            case FOUR_HOURS:
                return 4;
            default:
                return 0;
        }
    }
}
