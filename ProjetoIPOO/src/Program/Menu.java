/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import projetoipoo.Agender;
import projetoipoo.Group;
import projetoipoo.Instructor;
import projetoipoo.Student;
import projetoipoo.UC;

/**
 *
 * @author bruno
 */
public class Menu {
    private InputReader input;
    private Student std;
    public Menu(Student std) {
        this.input = new InputReader();
        if(std != null)this.std = std;
    }
    public void displayMainMenu(){
        System.out.println("*** Gestão de Agenda");
        System.out.println("");
        System.out.println("1 - Adicionar/Editar uma nova agenda");
        System.out.println("2 - Visualizar a agenda de um semestre");
        System.out.println("3 - Visualizar as estatisticas de um semestre");
        System.out.println("4 - Reinicializar as agendas do aluno");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção: ");
    }
    public void displayStatistics(){
        System.out.println("Estatisticas");
        System.out.println("Nome: "+std.getName());
        System.out.println("Curso: "+std.getCourse().toString());
        System.out.println("Numero de aluno: "+std.getStudentNumber());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public int readMainOption(){
        int option = input.getIntegerNumber("Opção");
        return option;
    }
    public void displayEditOption(){
        System.out.println("*** Edição de Agenda");
        System.out.println("");
        System.out.println("1 - Criar uma nova agenda");
        System.out.println("2 - Inserir uma nova disciplina");
        System.out.println("3 - Inserir um novo docente");
        System.out.println("4 - Inserir um novo grupo");
        System.out.println("5 - Adicionar aulas à uma disciplina");
        System.out.println("6 - Adicionar uma nova avaliação");
        System.out.println("0 - Voltar");
        System.out.println("Escolha a sua opção: ");
    }
    private void addAgender(){
        boolean isSemPar = false;
        String start = input.getText("Insira a data de inicio[dd/MM/yyyy]");
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy");
        LocalDate begining =LocalDate.parse(start);
        String end = input.getText("Insira a data de término[dd/MM/yyyy]");
        LocalDate ending = LocalDate.parse(end);
        String isPar = input.getText("O semestre é par?[S/N]");
        if(isPar.equalsIgnoreCase("true")) isSemPar = true;
        Agender agender = new Agender(begining,ending,isSemPar);
        std.addAgender(agender);
    }
    private void addUC(){
        String ucName = input.getText("Qual o nome da UC?");
        int id = input.getIntegerNumber("Qual o id da disciplina?");
        int credits = input.getIntegerNumber("Qual o número de creditos?");
        UC uc = new UC(ucName,id,credits);
        std.addUC(uc);
    }
    private void addInstructor(){
        String name = input.getText("Qual o nome do docente?");
        String email = input.getText("Qual o email do docente?");
        Instructor ins = new Instructor(name,email);
        for(Agender agender : std.getAgender()){
            if(agender != null){
                agender.addInstructor(ins);
            }
        }
    }
    private void addGroup(){
        for(Agender ag : std.getAgender()){
            if(ag!=null){
                ag.addGroup(new Group());
            }
        }
    }
    public int readEditOption(){
        int option = input.getIntegerNumber("Opção");
        return option;
    }
    public void displayViewOption(){
        System.out.println("*** Visualização de Agenda");
        System.out.println("");
        System.out.println("1 – Ver a nova agenda de um dia");
        System.out.println("2 – Ver a agenda de uma semana");
        System.out.println("3 – Ver as avaliações restantes de um semestre");
        System.out.println("4 – Ver o horário de atendimento dos docentes de uma disciplina");
        System.out.println("5 - Ver os meus grupos");
        System.out.println("6 - Ver o horário de uma sala");
        System.out.println("7 - Ver a lista de disciplinas com os responsáveis");
        System.out.println("0 - Voltar");
        System.out.println("Escolha a sua opção: ");
    }
    public int readViewOption(){
        int option = input.getIntegerNumber("Opção");
        return option;
    }
    public void resetAgender(){
        int student = input.getIntegerNumber("Número de aluno");
        for(Agender agender: std.getAgender()){
            agender = null;
        }
    }
    public void execute(){
        int option = 1;
        while(option != 0){
            displayMainMenu();
            switch(readMainOption()){
                case 1:
                    displayEditOption();
                    switch(readEditOption()){
                        case 1:
                            addAgender();
                            break;
                        case 2:
                            addUC();
                            break;
                        case 3:
                            addInstructor();
                            break;
                        case 4: 
                            addGroup();
                            break;
                        default:
                            displayMainMenu();
                            break;
                    }
                    break;
                case 2:
                    displayViewOption();
                    int viewOption = readViewOption();
                    break;
                case 3: 
                    displayStatistics();
                    break;
                case 4: 
                    String text = input.getText("Tem a certexa de que quer continuar? [S/N]");
                    if(text.equalsIgnoreCase("S")){
                        resetAgender();
                        break;
                    }else{
                        break;
                    }
                default:
                    option = 0;
            }
        }
    }
}
