/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A class Group implementa um grupo de alunos que se juntam para fazer trabalhos no âmbito de determinadas unidades curriculares
 * Esta classe utiliza as classes Student para definir uma coleção de estudantes e a UC para definir uma unidade curricular
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public class Group {
    private Student[] students;
    private UC uc;

    /**
     * Construtor que permite criar um grupo composto por um conjunto de alunos e uma unidade curricular
     * @param uc
     * @param stds-estudantes
     */
    public Group(UC uc,Student[] stds) {
        if(stds.length>10){
             students = new Student[10];
        }else{
            students = stds;
        }  
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
            for(int i = 0; i < students.length;i++){
                if(students[i] == null){
                    students[i] = std;
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Permite obter uma coleção de estudantes
     * @return estudantes
     */
    public Student[] getStudents(){
        return students;
    }
    
}
