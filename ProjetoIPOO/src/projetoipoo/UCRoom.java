/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author bruno
 */
public class UCRoom {
    private LocalDateTime classDate;
    private Instructor instructor;
    private Classroom room;
    private ClassroomType classroomType;

    public UCRoom(LocalDateTime classDate, Instructor instructor, Classroom room, ClassroomType classroomType) {
        if(classDate != null) this.classDate = classDate;
        if(instructor != null)this.instructor = instructor;
        if(room != null)this.room = room;
        if(classroomType != null)this.classroomType = classroomType;
    }
        public LocalDateTime getClassDate() {
        return classDate;
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

    @Override
    public String toString() {
        return "UCRoom{" + "classDate=" + classDate.toString() + ", instructor=" + instructor.toString() + ", room=" + room.toString() + ", classroomType=" + classroomType.toString() + '}';
    }
    
}
