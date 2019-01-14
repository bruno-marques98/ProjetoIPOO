/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDateTime;

/**
 * A classe Instructor implementa um docente
 * Esta classe utiliza as classes Classroom, para definir um sala onde o docente recebe os alunos, e Schedule para definir o horário de atendimento do docente
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Instructor {
    private String name;
    private int id = 0;
    private String email;
    private Classroom room;
    private Schedule[] schedule;
    private boolean isScheduleInserd = false;
    
    /**
     * Construtor que cria um docente com um horário de atendimento ainda não inserido
     * @param name
     * @param email
     * @param room
     */

    public Instructor(String name, String email,Classroom room,Schedule[] schedule){
        if(name != null){
            this.name = name;
        }else{
            this.name = "Alguem";
        }
        this.id++;
        if(email!= null && email.contains("@")){
            this.email = email;
        }else{
            this.email = "alguem@email.pt";
        }
        if(room!= null){
            this.room  = room;
        }
        this.schedule = schedule;
        isScheduleInserd = false;       
    }

    public Instructor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Permite ober o nome do docente
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Permite obter o número mecanográfico do docente
     * @return número
     */
    public int getId() {
        return id;
    }

    /**
     * Permite obter o e-mail do docente
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Permite obter a sala em que o docente recebe os estudantes
     * @return sala
     */
    public Classroom getRoom() {
        return room;
    }

    /**
     *
     * @return
     */
    public Schedule[] getSchedule() {
        return schedule;
    }

    /**
     * Permite saber se o horário está inserido ou não
     * @return true se o horário estiver inserido / false se não estiver inserido
     */
    public boolean isIsScheduleInserd() {
        return isScheduleInserd;
    }

    /**
     * Permite modificar a sala onde o docente recebe os alunos
     * @param room
     */
    public void setClassroom(Classroom room){
        if(room!= null){
            this.room  = room;
        }
    }

    /**
     * Permite adicionar um horário de atendimento ao docente
     * @param startDate
     * @param endDate
     */
    public void addAttendence(LocalDateTime startDate, LocalDateTime endDate){
        for(int i = 0; i < schedule.length;i++){
            if(schedule[i] == null){
                schedule[i] = new Schedule(startDate,endDate);
                return;
            }
        }
    }

    /**
     * Permite obter a informação do docente, numa cadeia de caractéres, mostrando também esta no ecrã
     * @return cadeia de caractéres
     */
    public String toString(){
        String str = "Instructor: "+ name+"\n";
        str+="Id: "+ id+"\n";
        str+="Email: "+email+"\n";
        str+="Class: "+room.toString()+"\n";
        for(int i = 0; i < schedule.length;i++){
            if(schedule[i] != null){
                str+="Schedule: "+schedule[i].dateToString();
            }
        }
        System.out.println(str);
        return str;
    }
}
