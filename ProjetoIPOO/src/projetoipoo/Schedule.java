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
 * A classe Schedule implementa um horário que permite representar um determinado compromisso ou uma determinada avaliação
 * A classe utiliz a classe LocalDateTime para definir a data do inicio e o fim do compromisso ou avaliação
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Schedule {
    private LocalDateTime beginning;
    private LocalDateTime ending;
    private double duration;
    
    /**
     * Construtor que permite criar um horario com duração de 90 minutos
     */
    public Schedule(){
        this.beginning = LocalDateTime.now();
        this.duration = 90;
        this.ending = LocalDateTime.now().plusMinutes(90);
    }

    /**
     * Construtor que permite criar um horãrio com uma data especifica e com uma duração pretendida
     * @param date
     * @param duration
     */
    public Schedule(LocalDateTime date, double duration){
        if(date != null){
            this.beginning = date;
        }
        if(duration >0){
            this.duration = duration;
        }
        this.ending = beginning.plusMinutes((long)duration);
    }

    /**
     * Construtor que permite criar um horário com uma data de inicio e fim especificas
     * @param beginDate
     * @param endDate
     */
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
    
    /**
     * Permite obter a data inicial do horário
     * @return data do inicio do compromisso ou avaliação
     */
    public LocalDateTime getBeginning(){
        return this.beginning;
    }

    /**
     * Permite obter a data final do horário
     * @return data final do compromisso ou avaliação
     */
    public LocalDateTime getEnding(){
        return this.ending;
    }

    /**
     * Permite obter a duração do compromisso ou avaliação
     * @return duração
     */
    public double getDuration(){
        return this.duration;
    }

    /**
     * Permite modificar a data inicial do horário
     * @param date-data inicial
     */
    public void setBeginning(LocalDateTime date){
        if(date != null){
            this.beginning = date;
        }
    }

    /**
     * Permite modificar a data final do horário
     * @param data-data final
     */
    public void setEnding(LocalDateTime data){
        if(data != null){
            this.ending = data;
        }
    }

    /**
     * Permite modificar a duração do compromisso ou avaliação
     * @param duration
     */
    public void setDuration(double duration){
        if(duration >0){
            this.duration = duration;
        }
    }
    
    /**
     * Permite obter a data inicial e duração do compromisso, numa cadeia de caractéres
     * @return cadeia de caractéres
     */
    public String dateAndDurationToString(){
        
        DateTimeFormatter  strFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String date = beginning.format(strFormat);
        return date + " - " + duration;
    }

    /**
     * Permite obter a data do inico e fim do compromisso, numa cadeia de caractéres
     * @return cadeia de caractéres
     */
    public String dateToString(){
        DateTimeFormatter  strFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String beginDate = strFormat.format(this.beginning);
        DateTimeFormatter strFormat2 = DateTimeFormatter.ofPattern("HH:mm");
        String endDate = strFormat2.format(this.ending);
        return beginDate + " - " + endDate;
    }
}
