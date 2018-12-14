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
public class Group {
    private Student[] students;
    private UC uc;

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

    public UC getUc() {
        return uc;
    }

    public void setUc(UC uc) {
         if(uc!=null){
            this.uc = uc;
        }
    }
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
    
    public Student[] getStudents(){
        return students;
    }
    
}
