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
public enum CourseType {
    GRADUATION, POSTGRADUATE_STUDIES, MASTER_DEGREE;

    @Override
    public String toString() {
        switch(this){
            case GRADUATION:
                return "Graduation";
            case POSTGRADUATE_STUDIES:
                return "Postgraduate studies";
            case MASTER_DEGREE:
                return "Master degree";
            default:
                return "";
        }
    }
    
    
}
