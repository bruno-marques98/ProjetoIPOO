/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
 

/**
 * A classe Department implementa uma entidade que agrega os docentes de uma mesma área cientifica
 * Esta classe utiliza as classes Course para definir uma lista de cursos e Instructor para defirnir uma lisa de docentes de uma mesma área cientifica
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

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
    public boolean addCourse(Course course){
        if(course != null){
            courses.add(course);
            return true;
        }
        return false;
    }
    public boolean addInstructor(Instructor ins){
        if(ins!=null){
            instructors.add(ins);
            return true;
        }
        return false;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.name.hashCode();
        hash = 17 * hash + this.courses.size();
        hash = 17 * hash + this.instructors.size();
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
        final Departement other = (Departement) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        if (!Objects.equals(this.instructors, other.instructors)) {
            return false;
        }
        return true;
    }
    
    
    
}
