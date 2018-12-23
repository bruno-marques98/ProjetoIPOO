/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * A classe Student implementa a caraterização de um estudante do IPS
 * A classe utiliza as classes LocalDate para definir a data de nascimento do aluno, Agender para definir uma lista de agendas, onde estão guardadas as agendas de cada um dos semestres do curso, e Course para definir o curso do aluno
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Student {
    private String name;
    private int studentNumber = 1;
    private LocalDate birthDate;
    private char genre;
    private Course course;
    private Agender[] agenders;

    /**
     * Construtor que permite criar um novo aluno
     * @param name
     * @param birthDate
     * @param genre
     * @param course
     */
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

    /**
     * Permite obter o nome do aluno
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Permite obter o número de estudante do aluno
     * @return número de estudante
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * Permite obter a lista de agendas
     * @return agendas
     */
    public Agender[] getAgender() {
        return agenders;
    }

    /**
     * Permite obter a data de nascimento do aluno
     * @return data
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Permite obter o género do aluno
     * @return género
     */
    public char getGenre() {
        return genre;
    }

    /**
     * Permite obter o curso em que o aluno está inserido
     * @return curso
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Permite modificar o curso do aluno
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }
    
    /**
     * Permite adicionar uma agenda à lista de agendas já existentes
     * @param agender
     * @return true se for possivel adicionar a agenda, adicionando a mesma / false se não for possivel adicionar
     */
    public boolean addAgender(Agender agender){
        for(int i = 0; i < agenders.length;i++){
            if(agenders[i] != null){
                agenders[i] = agender;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Permite obter a lista das agendas que se encontram ativas
     * @return lista das agendas ativas
     */
    public Agender getActiveAgender(){
        for(int i = 0; i <agenders.length;i++){
            if(agenders[i].getStartSemester().isBefore(LocalDate.now()) && agenders[i].getEndSemester().isAfter(LocalDate.now()) ){
                return agenders[i];
            }
        }
        return null;
    }

    /**
     * Permite adicionar uma unidade curricular à lista de agendas ativas
     * @param uc
     */
    public void addUC(UC uc){
        Agender ag = getActiveAgender();
        ag.addUC(uc);
    }
}
