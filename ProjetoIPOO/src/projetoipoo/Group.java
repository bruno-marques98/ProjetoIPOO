/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

import java.util.HashSet;

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
    public Group(UC uc,HashSet<Student> stds) {
        students = stds;
        if(uc!=null){
            this.uc = uc;
        }
        
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
    
}
