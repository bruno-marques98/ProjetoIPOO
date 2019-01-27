/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * A classe UC implementa uma unidade curricular
 * Esta classe utiliza a UCClass para definir uma lista de aulas dessa unidade curricular
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class UC {
    private String UCName;
    private String id;
    private int numberOfCredits;
    private ArrayList<UCClass> classes;
    private HashMap<Evaluation,Student> evaluations;
    /**
     * Construtor que permite criar uma determinada unidade curricular 
     * @param UCName
     * @param id
     */
  

    public UC(String UCName, int id, int numberOfCredits, ArrayList<UCClass> classes, HashMap<Evaluation,Student> evaluation) {
        this.UCName = UCName;
        this.id = UCName + id;
        this.numberOfCredits = numberOfCredits;
        this.classes = classes;
        this.evaluations = evaluation;
    }

    public UC(String UCName, int id, int numberOfCredits) {
        this.UCName = UCName;
        this.id = UCName + id;
        this.numberOfCredits = numberOfCredits;
        this.classes = new ArrayList<>();
        this.evaluations = new HashMap<>();
    }
    

    public boolean addEvaluation(Evaluation evaluation,Student std){
        if(evaluation!=null && std!=null && this.evaluations.containsKey(evaluation)){
            this.evaluations.put(evaluation, std);
            return true;
        }
        return false;
    }
    public HashMap<Evaluation, Student> getEvaluation() {
        return evaluations;
    }
    

    /**
     * Permite obter a lista de aulas 
     * @return aulas
     */
    public ArrayList<UCClass> getClasses() {
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
            classes.add(ucRoom);
            return true;
        }
        return false;
    }


    /**
     * Permite mostrar no ecrã a lista de aulas da unidade curricular
     */
    public void showClasses(){
        classes.forEach((clas) -> {
            System.out.println(clas.toString());
        });  
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.UCName.hashCode();
        hash = 79 * hash + this.id.hashCode();
        hash = 79 * hash + this.numberOfCredits;
        hash = 79 * hash + this.classes.hashCode();
        hash = 79 * hash + this.evaluations.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UC other = (UC) obj;
        if (this.numberOfCredits != other.numberOfCredits) {
            return false;
        }
        if (!Objects.equals(this.UCName, other.UCName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.classes, other.classes)) {
            return false;
        }
        if (!Objects.equals(this.evaluations ,other.evaluations)) {
            return false;
        }
        return true;
    }
    
}
