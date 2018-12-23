/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe UC implementa uma unidade curricular
 * Esta classe utiliza a UCClass para definir uma lista de aulas dessa unidade curricular
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public class UC {
    private String UCName;
    private String id;
    private int numberOfCredits;
    private UCClass[] classes;
    private Evaluation[] evaluation;
    /**
     * Construtor que permite criar uma determinada unidade curricular 
     * @param UCName
     * @param id
     */
  

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
    

    /**
     * Permite obter a lista de aulas 
     * @return aulas
     */
    public UCClass[] getClasses() {
        return classes;
    }

    /**
     * Permite obter o nome da unidade curricular
     * @return nome
     */
    public String getUCName() {
        return UCName;
    }

    /**
     * Permite modificar o nome da unidade curricular
     * @param UCName
     */
    public void setUCName(String UCName) {
        this.UCName = UCName;
    }

    /**
     * Permite obter o código da unidade curricular
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Permite modificar o código da unidade curricular
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Permite obter o número de créditos da unidade curricular
     * @return créditos
     */
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    /**
     * Permite modificar o número de créditos da unidade curricular
     * @param numberOfCredits
     */
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    /**
     * Permite adicionar uma aula da unidade curricular na lista de aulas já existente
     * @param ucRoom
     * @return true se for possivel adicionar a aula, adicionando a mesma / false se não for possivel
     */
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

    /**
     * 
     * @param rooms
     */
    public void addClasses(UCClass [] rooms){
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < classes.length; j++){
                if(classes[j]!=null){
                    classes[j] = rooms[i];
                }
            }
        }
    }
    
    /**
     * Permite mostrar no ecrã a lista de aulas da unidade curricular
     */
    public void showClasses(){
        for(int i = 0; i < classes.length;i++){
            if(classes[i] != null){
                System.out.println(classes[i].toString());
            }
           
        }
    }
}
