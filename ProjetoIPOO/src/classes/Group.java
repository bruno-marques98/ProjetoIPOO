/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashSet;
import java.util.Objects;

/**
 * A class Group implementa um grupo de alunos que se juntam para fazer trabalhos no âmbito de determinadas unidades curriculares
 * Esta classe utiliza as classes Student para definir uma coleção de estudantes e a UC para definir uma unidade curricular
 * @author bruno_170221059 Gonçalo_180221046
 * @version 
 */
public class Group {
    private HashSet<Student> students;
    private UC uc;

    /**
     * Construtor que permite criar um grupo composto por um conjunto de alunos e uma unidade curricular
     * @param uc
     * @param stds-estudantes
     */
    public Group(UC uc) {
        this.students = new HashSet<>();
        if(uc!=null){
            this.uc = uc;
        }
    }

    public Group() {
        this.students = new HashSet<>();
    }
    

    /**
     * Permite obter a unidade curricular
     * @return unidade curricular
     */
    public UC getUc() {
        return uc;
    }

    /**
     * Permite modificar a unidade curricular
     * @param uc
     */
    public void setUc(UC uc) {
         if(uc!=null){
            this.uc = uc;
        }
    }

    /**
     * Permite adicionar um novo estudante ao grupo
     * @param std
     * @return true se for possivel, adicionando o estudante / false se nao for possivel
     */
    public boolean addStudent(Student std){
        if(std!=null){
            students.add(std);
            return true;            
        }
        return false;
    }
    
    /**
     * Permite obter uma coleção de estudantes
     * @return estudantes
     */
    public HashSet<Student> getStudents(){
        return students;
    }
    
    public boolean containsStudent(int studentNumber){
        for(Student student : students){
            if(student.getStudentNumber() == studentNumber){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String txt = "UC: " + uc.getUCName();
        for(Student std : students){
            txt+= std.toString() + "\n";
        }
        return txt;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.students.hashCode();
        hash = 89 * hash + this.uc.getNumberOfCredits();
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
        final Group other = (Group) obj;
        if (!Objects.equals(this.students, other.students)) {
            return false;
        }
        if (!Objects.equals(this.uc, other.uc)) {
            return false;
        }
        return true;
    }
    
}
