/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * A classe UCRoom implementa uma sala de aula e o seu tipo onde vai ser lecionada uma determinada unidade curricular, com um respetivo docente responsável pela UC e uma determinada data em que esta vai ser lecionada
 * Esta classe utiliza as classes LocalDateTime para definir uma data para a unidade curricular ser lecionada, Instructor para defirnir o responsável pela unidade cirricular a ser lecionade, Room e RoomType , para definir uma sala de aula e o tipo da mesma disponivel para a lecionação da UC
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class UCRoom {
    private LocalDateTime classDate;
    private Instructor instructor;
    private Classroom room;
    private ClassroomType classroomType;

    /**
     * Construtor da classe que permite criar uma sala de aula disponivel para lecionar uma UC, com o docente responsável pela mesma, uma data e o tipo de sala
     * @param classDate-data da aula
     * @param instructor-docente responsável pela unidade curricular
     * @param room
     * @param classroomType
     */
    public UCRoom(LocalDateTime classDate, Instructor instructor, Classroom room, ClassroomType classroomType) {
        if(classDate != null) this.classDate = classDate;
        if(instructor != null)this.instructor = instructor;
        if(room != null)this.room = room;
        if(classroomType != null)this.classroomType = classroomType;
    }

    /**
     * Permite obter a data da aula da respetiva unidade curricular
     * @return data
     */
    public LocalDateTime getClassDate() {
        return classDate;
    }

    /**
     * Permite obter o docente responsável pela unidade curricular
     * @return docente
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Permite obter a sala onde vai ser lecionada a unidade curricular
     * @return sala de aula
     */
    public Classroom getRoom() {
        return room;
    }

    /**
     * Permite obter o tipo da sala onde vai ser lecionada a unidade curricular
     * @return tipo da sala de aula
     */
    public ClassroomType getClassroomType() {
        return classroomType;
    }

    /**
     * Permite obter as informações sobre a sala de aula da unidade curricular (data,docente,sala de aula e o tipo da sala), numa cadeia de caractéres
     * @return cadeia de caractéres
     */
    @Override
    public String toString() {
        return "UCRoom{" + "classDate=" + classDate.toString() + ", instructor=" + instructor.toString() + ", room=" + room.toString() + ", classroomType=" + classroomType.toString() + '}';
    }
    
}
