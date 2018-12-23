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
public class UC {
    private String UCName;
    private String id;
    private int numberOfCredits;
    private UCClass[] classes;
    private Evaluation[] evaluation;

    public UC(String UCName, int id, int numberOfCredits, UCClass[] classes, Evaluation[] evaluation) {
        this.UCName = UCName;
        this.id = UCName + id;
        this.numberOfCredits = numberOfCredits;
        this.classes = classes;
        this.evaluation = evaluation;
    }
    
  

    public Evaluation[] getEvaluation() {
        return evaluation;
    }
    

    public UCClass[] getClasses() {
        return classes;
    }
    public String getUCName() {
        return UCName;
    }

    public void setUCName(String UCName) {
        this.UCName = UCName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public boolean addClass(UCClass ucRoom){
        if(ucRoom != null){
            for(int i = 0; i < classes.length; i++){
                if(classes[i] == null){
                    classes[i] = ucRoom;
                    return true;
                }
            }
        }
        return false;
    }
    public void addClasses(UCClass [] rooms){
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < classes.length; j++){
                if(classes[j]!=null){
                    classes[j] = rooms[i];
                }
            }
        }
    }
    
    public void showClasses(){
        for(int i = 0; i < classes.length;i++){
            if(classes[i] != null){
                System.out.println(classes[i].toString());
            }
           
        }
    }
}
