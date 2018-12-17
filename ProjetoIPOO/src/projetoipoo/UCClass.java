/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author bruno
 */
public class UCClass {
    private LocalDateTime startClass;
    private LocalDateTime endClass;
    private Instructor instructor;
    private Classroom room;
    private ClassroomType classroomType;

    public UCClass(LocalDateTime startClass,LocalDateTime endClass, Instructor instructor, Classroom room, ClassroomType classroomType) {
        if(startClass != null) this.startClass = startClass;
        if(endClass != null) this.endClass = endClass;
        if(instructor != null)this.instructor = instructor;
        if(room != null)this.room = room;
        if(classroomType != null)this.classroomType = classroomType;
    }

    public LocalDateTime getStartClass() {
        return startClass;
    }

    public LocalDateTime getEndClass() {
        return endClass;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public Classroom getRoom() {
        return room;
    }

    public ClassroomType getClassroomType() {
        return classroomType;
    }
    
    public long minutesDuration(){
        long minutes = ChronoUnit.MINUTES.between(startClass, endClass);
        return minutes;
    }

    @Override
    public String toString() {
        return "UCRoom{" + "start= " + startClass.toString() + ", end= " + endClass + ", " + instructor.toString() + ", room=" + room.toString() + ", classroomType=" + classroomType.toString() + '}';
    }
    
}
