/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import classes.Agender;
import classes.Classroom;
import classes.ClassroomType;
import classes.Course;
import classes.CourseType;
import classes.Evaluation;
import classes.EvaluationType;
import classes.Group;
import classes.Instructor;
import classes.Schedule;
import classes.Student;
import classes.UC;
import classes.UCClass;

/**
 *
 * @author bruno_170221059 Gonçalo_180221046
 */
public class Program {

    /**
     * This is a testing method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UC uc = new UC("ohacs",23,50);
        UCClass ucRoom = new UCClass();
        uc.addClass(ucRoom);
        System.out.println(ucRoom.minutesDuration());
        /*Viewer viewer = new Viewer();
        
        Agender agender1 = new Agender(LocalDate.of(2018,10,1),LocalDate.of(2019,1,25),false);
        viewer.addAgender(agender1);
        
        Classroom classroom1 = new Classroom('A',101,50);
        viewer.addClassroom(classroom1);
        
        Instructor ins1 = new Instructor("José","jose@hotmail.com",classroom1);
        viewer.addInstructor(ins1);
        
        Course course1 = new Course("Engenharia Informática",CourseType.GRADUATION);
        Student std1 = new Student("Joaguim",LocalDate.of(1998,12,21),'M',course1);
        viewer.addStudent(std1);
        
        for(Student std : viewer.getStudents()){
            System.out.println();
            System.out.println(std.toString());
            System.out.println();
        }
        for(Instructor ins : viewer.getInstructors()){
            System.out.println();
            System.out.println("Professor");
            System.out.println(ins.toString());
            System.out.println();
        }
        System.out.println(viewer.getAgender().toString());*/
        Menu menu = new Menu();
        menu.execute();
    }
}
