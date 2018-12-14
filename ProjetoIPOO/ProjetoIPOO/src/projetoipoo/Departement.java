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
public class Departement {
    private String name;
    private Course[] courses;
    private Instructor[] instructors;

    public Departement(String name, Course[] courses, Instructor[] instructors) {
        this.name = name;
        this.courses = courses;
        this.instructors = instructors;
    }

    public Departement(String name) {
        this.name = name;
        courses = new Course[10];
        instructors = new Instructor[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }
    
    
}
