/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Statistics.Stats;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import classes.Agender;
import classes.ClassType;
import classes.Course;
import classes.CourseType;
import classes.Evaluation;
import classes.EvaluationType;
import classes.Group;
import classes.Instructor;
import classes.Student;
import classes.UC;
import classes.UCClass;
import classes.UCRoom;
import java.time.LocalDateTime;

/**
 *
 * @author bruno
 */
public class Menu {
    private InputReader input;
    private Student std;
    private Viewer viewer;
    private Stats stats;
    public Menu() {
        this.input = new InputReader();
        String name = input.getText("Nome do aluno?");
        int year = input.getIntegerNumber("Qual o ano de seu nascimento?");
        int month = input.getIntegerNumber("Qual o mês de seu nascimento?");
        int day = input.getIntegerNumber("Qual o dia de seu nascimento?");
        char genre= input.getText("Sexo?(M/F)").charAt(0);
        String course = input.getText("Qual o nome do curso?");
        String type = input.getText("Qual o grau de estudo?(GRADUATION, POSTGRADUATE STUDIES, MASTER_DEGREE)");
        CourseType courseType= null;
        if(type.equalsIgnoreCase("Graduation")){
            courseType = CourseType.GRADUATION;
        }else if(type.equalsIgnoreCase("Postgraduate studies")){
            courseType = CourseType.POSTGRADUATE_STUDIES;
        }else if(type.equalsIgnoreCase("master degree")){
            courseType = CourseType.MASTER_DEGREE;
        }else{
            courseType = CourseType.GRADUATION;
        }
        this.std = new Student(name,LocalDate.of(year, month, day),genre,new Course(course,courseType));
        this.viewer = new Viewer();
        viewer.addStudent(std);
        this.stats = new Stats(viewer);
        
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
        System.out.println("Número de aluno: "+std.getStudentNumber());
        System.out.println("Número de aulas por tipo:");
        numberClassesByType();
        System.out.println("Número de horas de avaliações: "+ stats.hoursOfEvaluations());
        System.out.println("Quantidade de avaliações por fazer: "+stats.evaluationsToDo());
        System.out.println("Número de horas de aulas até fim do semestre: "+stats.classesTillEnd());
        System.out.println("Número de créditos das disciplinas: "+stats.totalCredits());
        System.out.println("Média de horas semanais: "+stats.averageHoursPerWeek());
        System.out.println("Número médio de aulas: " +stats.classesHours(std));
    }
    private void numberClassesByType(){
        System.out.println("Número de aulas de laboratório: "+stats.hoursByClassesType(ClassType.LAB));
        System.out.println("Número de aulas práticas: "+stats.hoursByClassesType(ClassType.PRACTICAL));
        System.out.println("Número de aulas teóricas: "+stats.hoursByClassesType(ClassType.THEORY));
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
        viewer.addAgender(agender);
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
                viewer.addInstructor(ins);
            }
        }
    }
    private void addGroup(){
        for(Agender ag : std.getAgender()){
            if(ag!=null){
                Group group = new Group();
                group.addStudent(std);
                ag.addGroup(group);
            }
        }
    }
    private void addClass(){
        String ucName = input.getText("Qual o nome da disciplina?");
        for(UC uc : std.getActiveAgender().getUcs()){
            if(uc.getUCName().equalsIgnoreCase(ucName)){
                uc.addClass(new UCClass());
            }
        }
    }
    private void addEvaluation(){
        String evalType = input.getText("Qual o tipo de avaliação?");
        String description = input.getText("Adicionar descrição se quiser.");
        int year = input.getIntegerNumber("Qual o ano da avaliação?");
        int month = input.getIntegerNumber("Qual o mês da avaliação?");
        int day = input.getIntegerNumber("Qual o dia da avaliação?");
        int hour = input.getIntegerNumber("Qual a hora da avaliação?");
        String ucName = input.getText("Qual o nome da disciplina alvo de avaliação?");
        
        EvaluationType type = null;
        Evaluation eval = null;
        if(evalType.equalsIgnoreCase("Test")){
            type = EvaluationType.TEST;
            eval = new Evaluation(type,description,LocalDateTime.of(year, month, day,hour,0,0));
        }else if(evalType.equalsIgnoreCase("Exam")){
            type = EvaluationType.EXAM;
            eval = new Evaluation(type,description,LocalDateTime.of(year, month, day,hour,0,0));
        }else if(evalType.equalsIgnoreCase("Presentation")){
            type = EvaluationType.PRESENTATION;
            eval = new Evaluation(type,description,LocalDateTime.of(year, month, day,hour,0,0));
        }else if(evalType.equalsIgnoreCase("Project")){
            type = EvaluationType.PROJECT;
            eval = new Evaluation(type,description,LocalDateTime.of(year, month, day,hour,0,0));
        }else{
        }
        for(UC uc : std.getActiveAgender().getUcs()){
            if(uc.getUCName().equalsIgnoreCase(ucName)){
                uc.addEvaluation(eval, std);
                viewer.addEvaluation(eval);
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
                        case 5:
                            addClass();
                            break;
                        case 6: 
                            addEvaluation();
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
