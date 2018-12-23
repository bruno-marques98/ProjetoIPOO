/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe Department implementa uma entidade que agrega os docentes de uma mesma área cientifica
 * Esta classe utiliza as classes Course para definir uma lista de cursos e Instructor para defirnir uma lisa de docentes de uma mesma área cientifica
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public class Departement {
    private String name;
    private Course[] courses;
    private Instructor[] instructors;

    /**
     * Construtor que cria um departamento
     * @param name
     * @param courses
     * @param instructors
     */
    public Departement(String name, Course[] courses, Instructor[] instructors) {
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
        courses = new Course[10];
        instructors = new Instructor[10];
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
    public Course[] getCourses() {
        return courses;
    }

    /**
     * Permite modificar os cursos
     * @param courses
     */
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    /**
     * Permite obter a lista de docentes do departamento
     * @return
     */
    public Instructor[] getInstructors() {
        return instructors;
    }

    /**
     * Permite modificar os docentes
     * @param instructors
     */
    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }
    
    
}
