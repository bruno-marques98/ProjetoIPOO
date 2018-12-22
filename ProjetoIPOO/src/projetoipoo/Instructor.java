/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.LocalDateTime;

/**
 *
 * @author bruno
 */
public class Instructor {
    private String name;
    private int id = 0;
    private String email;
    private Classroom room;
    private Schedule[] schedule;
    private boolean isScheduleInserd;
    
    public Instructor(String name, String email,Classroom room){
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
        schedule = new Schedule[10];
        isScheduleInserd = false;       
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public Classroom getRoom() {
        return room;
    }
    public Schedule[] getSchedule() {
        return schedule;
    }
    public boolean isIsScheduleInserd() {
        return isScheduleInserd;
    }
    public void setClassroom(Classroom room){
        if(room!= null){
            this.room  = room;
        }
    }
    public void addAttendence(LocalDateTime startDate, LocalDateTime endDate){
        for(int i = 0; i < schedule.length;i++){
            if(schedule[i] == null){
                schedule[i] = new Schedule(startDate,endDate);
                return;
            }
        }
    }
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
