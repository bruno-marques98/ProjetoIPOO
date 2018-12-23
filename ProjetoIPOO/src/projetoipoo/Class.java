/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Class implementa uma aula
 * Esta classe utiliza a classe ClassType para defirnir o tipo de aula, a classe ClassDurationTime para definir o tempo de duração da aula, a classe Classroom para definir uma sala, e,por fim, a classe Instructor para definir o docente reponsavél pela aula
 * @author bruno_?;Gonçalo_180221046
 * @version 
 */
public class Class {
    private ClassType type;
    private ClassDurationType duration;
    private Classroom classroom;
    private Instructor instructor;
    private Schedule schedule;

<<<<<<< HEAD
    /**
     * Construtor da classe Class,que permite criar uma aula, com um determinado tipo, duração, sala e docente
     * @param type
     * @param duration
     * @param classroom
     * @param instructor
     */
    public Class(ClassType type, ClassDurationType duration, Classroom classroom, Instructor instructor) {
=======
    public Class(ClassType type, ClassDurationType duration, Classroom classroom, Instructor instructor,LocalDateTime date) {
>>>>>>> f6e7602cf09ed8ddaddc1c4b516fa89ea4cf53b2
        this.type = type;
        this.duration = duration;
        this.classroom = classroom;
        this.instructor = instructor;
        schedule = new Schedule(date,duration.getDuration()); 
    }

    /**
     * Permite obter o tipo da aula
     * @return tipo (teórica,prática,laboratorio,tutorias)
     */
    public ClassType getType() {
        return type;
    }

    /**
     * Permite modificar o tipo da aula
     * @param type
     */
    public void setType(ClassType type) {
        this.type = type;
    }

    /**
     * Permite obter a duração da aula
     * @return duração
     */
    public ClassDurationType getDuration() {
        return duration;
    }

    /**
     * Permite modificar o tempo de duração da aula
     * @param duration
     */
    public void setDuration(ClassDurationType duration) {
        this.duration = duration;
    }

    /**
     * Permite obter uma sala de aula
     * @return sala de aula
     */
    public Classroom getClassroom() {
        return classroom;
    }

    /**
     * Permite modificar a sala de aula
     * @param classroom
     */
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    /**
     * Permite obter o docente que redige a aula
     * @return docente
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Permite modificar o docente
     * @param instructor
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    

<<<<<<< HEAD
    /**
     * Permite obter uma cadeia de caractéres com a informação sobre a aula (tipo,duração,sala,docente)
     * @return cadeia de caractéres 
     */
=======
    
>>>>>>> f6e7602cf09ed8ddaddc1c4b516fa89ea4cf53b2
    @Override
    public String toString() {
        return "Class{" + "type=" + type + ", duration=" + duration.toString() + ", classroom=" + classroom + ", " + instructor.toString() + '}';
    }
    
}
