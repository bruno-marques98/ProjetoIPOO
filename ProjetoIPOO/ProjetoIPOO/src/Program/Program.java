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
        Classroom cs = new Classroom('F',205,5);
        Instructor in = new Instructor("José da Silva",1801,"jose.silva@email.pt",cs);
        UC uc = new UC("Matemática", "m107");
        LocalDateTime date = LocalDateTime.of(2018,6,30,12,00);
       // uc.addClass(new UCClass(date,in,cs,ClassroomType.TUTORIALS));
        uc.showClasses();
        
        
        LocalDateTime startSemester = LocalDateTime.of(2018,10,1,00,00);
        LocalDateTime endSemester = LocalDateTime.of(2019,1,27,00,00);
        
        Agender agender = new Agender(startSemester,endSemester,false);
        //Group group = new Group()
        agender.addUC(uc);
        
    }
        
        
    
}
