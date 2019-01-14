/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;
 

/**
 * A classe Department implementa uma entidade que agrega os docentes de uma mesma área cientifica
 * Esta classe utiliza as classes Course para definir uma lista de cursos e Instructor para defirnir uma lisa de docentes de uma mesma área cientifica
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
import java.util.ArrayList;
import java.util.HashSet;

public class Departement {
    private String name;
    private ArrayList<Course> courses;
    private HashSet<Instructor> instructors;

    /**
     * Construtor que cria um departamento
     * @param name
     * @param courses
     * @param instructors
     */
    public Departement(String name, ArrayList<Course> courses, HashSet<Instructor> instructors) {
        this.name = name;
        this.courses = courses;
        this.instructors = instructors;
    }

    /**
     * Contrutor que cria um departamento, em que o número da lista de docentes e cursos é 10
     * @param name
     */
    public Departement(String name) {
        this.name = name;
        courses = new ArrayList<>();
        instructors = new HashSet<>();
    }

    /**
     * Permite obter o nome do departamento
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Permite modificar o nome do departamento
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * Permite modificar os cursos
     * @param courses
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    /**
     * Permite obter a lista de docentes do departamento
     * @return
     */
    public HashSet<Instructor> getInstructors() {
        return instructors;
    }

    /**
     * Permite modificar os docentes
     * @param instructors
     */
    public void setInstructors(HashSet<Instructor> instructors) {
        this.instructors = instructors;
    }
    
    
}
