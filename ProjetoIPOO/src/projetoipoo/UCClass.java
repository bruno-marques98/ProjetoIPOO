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
 * A classe UCClass implementa uma aula de uma determinada unidade curricular
 * Esta classe utiliza as classes LocalDateTime para definir a data de inicio e fim da aula, Instructor para definir o docente responsável por lecionar a unidade curricular,Classroom para definir uma sala de aula para 
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class UCClass {
    private LocalDateTime startClass;
    private LocalDateTime endClass;
    private Instructor instructor;
    private Classroom room;
    private ClassroomType classroomType;
    

    /**
     * Construtor que cria uma aula de uma determinada UC
     * @param startClass
     * @param endClass
     * @param instructor
     * @param room
     * @param classroomType
     */
    public UCClass(LocalDateTime startClass,LocalDateTime endClass, Instructor instructor, Classroom room, ClassroomType classroomType) {
        if(startClass != null) this.startClass = startClass;
        if(endClass != null) this.endClass = endClass;
        if(instructor != null)this.instructor = instructor;
        if(room != null)this.room = room;
        if(classroomType != null)this.classroomType = classroomType;
    }

    /**
     * Permite obter a data e hora do inicio da aula
     * @return data e hora
     */
    public LocalDateTime getStartClass() {
        return startClass;
    }

    /**
     * Permite obter a data e hora do final da aula
     * @return data e hora
     */
    public LocalDateTime getEndClass() {
        return endClass;
    }

    /**
     * Permite obter o docente responsável por lecionar a UC
     * @return docente
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Permite obter a sala de aula onde vai ser lecionada a UC
     * @return sala
     */
    public Classroom getRoom() {
        return room;
    }

    /**
     * Permite obter o tipo de sala
     * @return tipo de sala
     */
    public ClassroomType getClassroomType() {
        return classroomType;
    }
    
    /**
     * Permite obter a duração da aula, em minutos
     * @return duração da aula
     */
    public long minutesDuration(){
        long minutes = ChronoUnit.MINUTES.between(startClass, endClass);
        return minutes;
    }

    /**
     * Permite obter as informações da aula, numa cadeia de caractéres (inicio da aula,final da aula, sala de aula, docente e o tipo de sala)
     * @return cadeia de caractéres com a informação da aula
     */
    @Override
    public String toString() {
        return "UCRoom{" + "start= " + startClass.toString() + ", end= " + endClass + ", " + instructor.toString() + ", room=" + room.toString() + ", classroomType=" + classroomType.toString() + '}';
    }
    
}
