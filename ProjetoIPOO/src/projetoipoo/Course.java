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
public class Course {
    private String name;
    private CourseType type;
    private String initials;
    private int credits;

    public Course(String name, CourseType type, String initials, int credits) {
       this.type = type;
        if(type == type.GRADUATION){
            if(name != null){
                if(name.equalsIgnoreCase("Engenharia de Automação, Controlo e Instrumentação")){
            this.name = name;
            this.initials = "LEACI";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Engenharia Eletrotécnica e de Computadores")){
            this.name = name;
            this.initials = "LEEC";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Engenharia Informática")){
            this.name = name;
            this.initials = "LEI";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Engenharia Mecânica")){
            this.name = name;
            this.initials = "LEM";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Tecnologia Biomédica")){
            this.name = name;
            this.initials = "LTB";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Tecnologias de Energia")){
            this.name = name;
            this.initials = "LTE";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Tecnologia e Gestão Industrial")){
            this.name = name;
            this.initials = "LTGI";
            this.credits = 180;
        }
            else if(name.equalsIgnoreCase("Tecnologia do Ambiente e do Mar") ){
            this.name = name;
            this.initials = "LTAM";
            this.credits = 180;
        }
       
        }else if(type == type.MASTER_DEGREE){
            if(name.equalsIgnoreCase("Engenharia de Software")){
            this.name = name;
            this.initials = "MES";
            this.credits = 120;
        }
            else if(name.equalsIgnoreCase("Engenharia Eletrotécnica e de Computadores")){
            this.name = name;
            this.initials = "MEEC";
            this.credits = 120;
        }
            else if(name.equalsIgnoreCase("Engenharia de Produção")){
            this.name = name;
            this.initials = "";
            this.credits = 120;
        }
            else if(name.equalsIgnoreCase("Informática de Gestão")){
            this.name = name;
            this.initials = "MIG";
            this.credits = 120;
        }
            else if(name.equalsIgnoreCase("Segurança e Higiene no Trabalho")){
            this.name = name;
            this.initials = "";
            this.credits = 120;
        }
    }else if(type == type.POSTGRADUATE_STUDIES){
            if(name.equalsIgnoreCase("Engenharia Informática")){
            this.name = name;
            this.initials = "";
            this.credits = 32;
        }
            else if(name.equalsIgnoreCase("Motorizção de Veículos Elétricos e Híbridos")){
            this.name = name;
            this.initials = "";
            this.credits = 32;
        }
            else if(name.equalsIgnoreCase("Produção Aeronáutica")){
            this.name = name;
            this.initials = "";
            this.credits = 32;
        }
    
    }else{
        this.name = "";
        this.initials = "";
        this.credits = 0;
    }
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return type + "\n" + "Course{" + name + ", Initials: " + initials + ", Credits: " + credits ;
    }
    
}
