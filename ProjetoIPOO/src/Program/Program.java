/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.time.LocalDateTime;
import java.time.LocalTime;
import projetoipoo.Agender;
import projetoipoo.Classroom;
import projetoipoo.Evaluation;
import projetoipoo.EvaluationType;
import projetoipoo.Instructor;
import projetoipoo.UC;

/**
 *
 * @author bruno
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Classroom class1 = new Classroom('A',101,50);
         Classroom class2 = new Classroom('A',102,50);
         Classroom class3 = new Classroom('A',103,50);
         Classroom class4 = new Classroom('B',201,50);
         Classroom class5 = new Classroom('B',212,50);
         Classroom class6 = new Classroom('C',300,50);
         Classroom class7 = new Classroom('C',329,35);
         Classroom class8 = new Classroom('C',312,60);
         Classroom class9 = new Classroom('C',354,40);
         
         // public Evaluation(EvaluationType type, String description, Classroom classroom) {
         Evaluation evaluation = new Evaluation(EvaluationType.TEST,"Teste",class1);
    }
        
        
    
}
