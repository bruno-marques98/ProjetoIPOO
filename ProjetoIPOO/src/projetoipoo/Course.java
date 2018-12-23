/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoipoo;

/**
 * A classe Course implementa a escolha de um curso
 * Estão apenas disponiveis para a escolha do cursos da ESTSetubal
 * A classe utiliza a classe CourseType para definir o tipo de curso
 * @author Bruno_?;Gonçalo_180221046
 * @version 
 */
public class Course {
    private String name;
    private CourseType type;
    private String initials;
    private int credits;


    /**
     * Construtor da classe que permite criar um curso, mas apenas cursos existentes na ESTSetubal
     * @param name
     * @param type
     * @param initials-inicias do curso
     * @param credits-créditos de cada curso
     */
    public Course(String name, CourseType type) {
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
                        this.initials = "MEP";
                        this.credits = 120;
                    }
                        else if(name.equalsIgnoreCase("Informática de Gestão")){
                        this.name = name;
                        this.initials = "MIG";
                        this.credits = 120;
                    }
                        else if(name.equalsIgnoreCase("Segurança e Higiene no Trabalho")){
                        this.name = name;
                        this.initials = "MSHT";
                        this.credits = 120;
                    }
                    }else if(type == type.POSTGRADUATE_STUDIES){
                        if(name.equalsIgnoreCase("Engenharia Informática")){
                        this.name = name;
                        this.initials = "PEI";
                        this.credits = 32;
                    }
                        else if(name.equalsIgnoreCase("Motorizção de Veículos Elétricos e Híbridos")){
                        this.name = name;
                        this.initials = "PMVEH";
                        this.credits = 32;
                    }
                        else if(name.equalsIgnoreCase("Produção Aeronáutica")){
                        this.name = name;
                        this.initials = "PPA";
                        this.credits = 32;
                    }

                }else{
                    this.name = "";
                    this.initials = "";
                    this.credits = 0;
                }
            }
    }

    /**
     * Permite obter uma cadeia de caractéres com as informações do curso(nome,iniciais e creditos)
     * @return cadeia de caractéres
     */
    @Override
    public String toString() {
        return type + "\n" + "Course{" + name + ", Initials: " + initials + ", Credits: " + credits ;
    }
    
}
