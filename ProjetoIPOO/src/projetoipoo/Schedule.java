/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bruno
 */
public class Schedule {
    private LocalDateTime beginning;
    private LocalDateTime ending;
    private double duration;
    
    public Schedule(){
        this.beginning = LocalDateTime.now();
        this.duration = 90;
        this.ending = LocalDateTime.now().plusMinutes(90);
    }
    public Schedule(LocalDateTime date, double duration){
        if(date != null){
            this.beginning = date;
        }
        if(duration >0){
            this.duration = duration;
        }
        this.ending = beginning.plusMinutes((long)duration);
    }
    public Schedule(LocalDateTime beginDate, LocalDateTime endDate){
        if(beginDate != null){
            this.beginning = beginDate;
        }
        if(endDate != null){
            this.ending = endDate;
        }
        Duration dateDuration = Duration.between(ending,beginning);
        this.duration = (int)Math.abs(dateDuration.toMinutes());
        
    }
    
    public LocalDateTime getBeginning(){
        return this.beginning;
    }
     public LocalDateTime getEnding(){
        return this.ending;
    }
    public double getDuration(){
        return this.duration;
    }
    public void setBeginning(LocalDateTime date){
        if(date != null){
            this.beginning = date;
        }
    }
    public void setEnding(LocalDateTime data){
        if(data != null){
            this.ending = data;
        }
    }
    public void setDuration(double duration){
        if(duration >0){
            this.duration = duration;
        }
    }
    
    public String dateAndDurationToString(){
        
        DateTimeFormatter  strFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String date = beginning.format(strFormat);
        return date + " - " + duration;
    }
    public String dateToString(){
        DateTimeFormatter  strFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String beginDate = strFormat.format(this.beginning);
        DateTimeFormatter strFormat2 = DateTimeFormatter.ofPattern("HH:mm");
        String endDate = strFormat2.format(this.ending);
        return beginDate + " - " + endDate;
    }
}
