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
public class Class {
    private ClassType type;
    private ClassDurationType duration;
    private Classroom classroom;
    private Instructor instructor;

    public Class(ClassType type, ClassDurationType duration, Classroom classroom, Instructor instructor) {
        this.type = type;
        this.duration = duration;
        this.classroom = classroom;
        this.instructor = instructor;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public ClassDurationType getDuration() {
        return duration;
    }

    public void setDuration(ClassDurationType duration) {
        this.duration = duration;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Class{" + "type=" + type + ", duration=" + duration.toString() + ", classroom=" + classroom + ", " + instructor.toString() + '}';
    }
    
}
