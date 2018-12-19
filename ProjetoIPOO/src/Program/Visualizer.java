/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import projetoipoo.Classroom;
import projetoipoo.Evaluation;
import projetoipoo.Group;
import projetoipoo.Instructor;
import projetoipoo.Student;
import projetoipoo.Agender;
import projetoipoo.Class;
import projetoipoo.ClassDurationType;
import projetoipoo.ClassType;


/**
 *
 * @author bruno
 */
public class Visualizer {
    private Instructor[] instructors;
    private Student[] students;
    private Classroom[] classrooms;
    private Evaluation[] evaluations;

    public Visualizer() {
        this.instructors = new Instructor[50];
        this.students = new Student[100];
        this.classrooms = new Classroom[30];
        this.evaluations = new Evaluation[20];
    }
    
    public void showGroups(int studentNumber, Group[] groups){
         for(Group group : groups){
             if(group.containsStudent(studentNumber)){
                 group.toString();
             }
         }
    }
    
    
    
    
    
}
