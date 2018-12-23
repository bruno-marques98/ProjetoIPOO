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
public class Student {
    private String name;
    private int studentNumber = 1;
    private LocalDate birthDate;
    private char genre;
    private Course course;
    private Agender[] agenders;

    public Student(String name, LocalDate birthDate, char genre, Course course) {
        this.name = name;
        this.studentNumber++;
        this.birthDate = birthDate;
        if(genre == 'H' || genre == 'F'){
             this.genre = genre;
        }else{
            this.genre = 'H';
        }
        this.course = course;
        this.agenders = new Agender[10];
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public Agender[] getAgender() {
        return agenders;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    public boolean addAgender(Agender agender){
        for(int i = 0; i < agenders.length;i++){
            if(agenders[i] != null){
                agenders[i] = agender;
                return true;
            }
        }
        return false;
    }
    
    public Agender getActiveAgender(){
        for(int i = 0; i <agenders.length;i++){
            if(agenders[i].getStartSemester().isBefore(LocalDate.now()) && agenders[i].getEndSemester().isAfter(LocalDate.now()) ){
                return agenders[i];
            }
        }
        return null;
    }
    public void addUC(UC uc){
        Agender ag = getActiveAgender();
        ag.addUC(uc);
    }
}
