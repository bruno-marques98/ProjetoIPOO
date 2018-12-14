/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 *
 * @author bruno
 */
public class Classroom {
    String name;
    char zone;
    int roomNumber;
    int capacity;
    
    public Classroom(char zone, int roomNumber, int capacity){
        if(zone >='A' || zone <= 'Z'){
            this.zone = zone;
        }
        if(roomNumber >0){
            this.roomNumber = roomNumber;
        }
        this.name = zone + String.valueOf(roomNumber);
        if(capacity >= 0){
            this.capacity = capacity;
        }
    }
    
    public String getName(){
        return name;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setName(char zone, int roomNumber){
        if(zone >='A' || zone <= 'Z'){
            this.zone = zone;
        }
        if(roomNumber >0){
            this.roomNumber = roomNumber;
        }
        this.name = zone + String.valueOf(roomNumber);
    }
    public void setCapacity(int capacity){
        if(capacity >= 0){
            this.capacity = capacity;
        }
    }
    
    public String toString(){
        String str = "";
        str = "Identificação da sala: "+name+"\n";
        str+= "Capacidade: "+ capacity;
        System.out.println(str);
        return str;
    }
    
}
