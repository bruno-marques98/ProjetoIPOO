/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * A classe CourseType implementa um tipo de curso
 * Apenas estão diponiveis tipos de cursos existentes na ESTSetubal
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public enum CourseType {
    GRADUATION, POSTGRADUATE_STUDIES, MASTER_DEGREE;

    /**
     * Permite obter o tipo de curso, numa cadeia de caractéres
     * @return tipo de curso
     */
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
