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
        Menu menu = new Menu();
        menu.execute();
    }
}
