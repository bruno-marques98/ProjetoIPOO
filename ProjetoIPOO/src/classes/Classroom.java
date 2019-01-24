/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Classroom implementa uma sala 
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Classroom {
    String name;
    char zone;
    int roomNumber;
    int capacity;
    
    /**
     * Construtor da classe Classroom, que permite criar uma nova sala 
     * @param zone
     * @param roomNumber
     * @param capacity
     */
    public Classroom(char zone, int roomNumber, int capacity){
        if(zone >='A' || zone <= 'F'){
            this.zone = zone; 
        }
        if(roomNumber >0 && roomNumber <99){
            this.roomNumber = roomNumber;
        }
        this.name = zone + String.valueOf(roomNumber);
        if(capacity >= 0){
            this.capacity = capacity;
        }
    }
    
    /**
     * Permite obter o nome da sala 
     * @return nome da sala 
     */
    public String getName(){
        return name;
    }

    /**
     * Permite obter a capacidade de alunos da sala 
     * @return capacidade de alunos
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * Permite modificar o nome da sala
     * @param zone
     * @param roomNumber
     */
    public void setName(char zone, int roomNumber){
        if(zone >='A' || zone <= 'F'){
            this.zone = zone;
        }
        if(roomNumber >0 && roomNumber <99){
            this.roomNumber = roomNumber;
        }
        this.name = zone + String.valueOf(roomNumber);
    }

    /**
     * Permite modificar a capacidade da sala
     * @param capacity
     */
    public void setCapacity(int capacity){
        if(capacity >= 0){
            this.capacity = capacity;
        }
    }
    
    /**
     * Permite obter uma cadeia de caractéres onde mostre as informações da sala (nome,capacidade)
     * @return cadeia de caractéres com a informção da sala
     */
    public String toString(){
        String str = "";
        str = "Identificação da sala: "+name+"\n";
        str+= "Capacidade: "+ capacity;
        System.out.println(str);
        return str;
    }
    
}
