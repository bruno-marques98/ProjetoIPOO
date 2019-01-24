/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import classes.Agender;
import classes.Classroom;
import classes.ClassroomType;
import classes.Course;
import classes.CourseType;
import classes.Evaluation;
import classes.EvaluationType;
import classes.Group;
import classes.Instructor;
import classes.Schedule;
import classes.Student;
import classes.UC;
import classes.UCClass;

/**
 *
 * @author bruno_170221059 Gonçalo_180221046
 */
public class Program {

    /**
     * This is a testing method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course[] courses = createCourses();
        Student student = new Student("Afonso",LocalDate.of(1998,10,10),'H',courses[0]);
        
        Menu menu = new Menu(student);
        menu.execute();
        /*
        Classroom[] classrooms = createClassrooms();
         
        Evaluation[] evaluations = createEvaluations(classrooms);
         
        Schedule[] schedules = createSchedules();
         
        Instructor[] instructors = createInstructors(classrooms, schedules);
         
        Course[] courses = createCourses();

        Student[] students = createStudents(courses);       
        
        UCClass[] classes = createUCClasses(instructors,classrooms);

        UC[] ucs = createUcs(classes,evaluations);
        
        Group[] groups = createGroups(ucs,students);
        groups[0].addStudent(students[0]);
        
        Agender agender = new Agender(LocalDate.of(2018,10,1),LocalDate.of(2019,1,28),false,ucs,instructors,groups,schedules);
         
        Visualizer visualizer = new Visualizer(instructors,students,classrooms,evaluations,agender);
         
        visualizer.showGroups(1, groups);
        
        Schedule[] weekSchedule = visualizer.getWeekSchedule(1);
        for(int i = 0; i < weekSchedule.length;i++){
            weekSchedule[i].dateAndDurationToString();
        }*/
         
    }
    /**
     * Cria salas de aula
     * @return Classrooms
     */ 
    private static Classroom[] createClassrooms(){
        Classroom class1 = new Classroom('A',101,50);
        Classroom class2 = new Classroom('A',102,50);
        Classroom class3 = new Classroom('A',103,50);
        Classroom class4 = new Classroom('B',201,50);
        Classroom class5 = new Classroom('B',212,50);
        Classroom class6 = new Classroom('C',300,50);
        Classroom class7 = new Classroom('C',329,35);
        Classroom class8 = new Classroom('C',312,60);
        Classroom class9 = new Classroom('C',354,40);
         
        Classroom[] classrooms = new Classroom[10];
        classrooms[0] = class1;
        classrooms[1] = class2;
        classrooms[2] = class3;
        classrooms[3] = class4;
        classrooms[4] = class5;
        classrooms[5] = class6;
        classrooms[6] = class7;
        classrooms[7] = class8;
        classrooms[8] = class9;
         
        return classrooms;
    }
     /**
     * Cria várias avaliações
     * @param classrooms
     * @return evaluations
     */ 
    private static Evaluation[] createEvaluations(Classroom[] classrooms){
        Evaluation evaluation = new Evaluation(EvaluationType.TEST,"Teste",classrooms[0]);
        Evaluation evaluation1 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[6]);
        Evaluation evaluation2 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[7]);
        Evaluation evaluation3 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",classrooms[8]);
        Evaluation evaluation4 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[2]);
        Evaluation evaluation5 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[1]);
        Evaluation evaluation6 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",classrooms[0]);
        Evaluation evaluation7 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[5]);
        Evaluation evaluation8 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[3]);
        Evaluation evaluation9 = new Evaluation(EvaluationType.PROJECT,"Projeto",classrooms[7]);
        Evaluation evaluation10 = new Evaluation(EvaluationType.PROJECT,"Projeto",classrooms[1]);
        Evaluation evaluation11 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[2]);
        Evaluation evaluation12 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[6]);
        Evaluation evaluation13 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",classrooms[0]);
        Evaluation evaluation14 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[8]);
        Evaluation evaluation15 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[7]);
        Evaluation evaluation16 = new Evaluation(EvaluationType.PROJECT,"Projeto",classrooms[0]);
        Evaluation evaluation17 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[3]);
        Evaluation evaluation18 = new Evaluation(EvaluationType.TEST,"Teste",classrooms[4]);
        Evaluation evaluation19 = new Evaluation(EvaluationType.EXAM,"Exame",classrooms[2]);
        Evaluation evaluation20 = new Evaluation(EvaluationType.EXAM,"Exame",classrooms[3]);
        Evaluation evaluation21 = new Evaluation(EvaluationType.EXAM,"Exame",classrooms[5]);
        Evaluation evaluation22 = new Evaluation(EvaluationType.EXAM,"Exame",classrooms[0]);
         
        Evaluation[] evaluations = new Evaluation[23];
         
        evaluations[0] = evaluation1;
        evaluations[1] = evaluation2;
        evaluations[2] = evaluation3;
        evaluations[3] = evaluation4;
        evaluations[4] = evaluation5;
        evaluations[5] = evaluation6;
        evaluations[6] = evaluation7;
        evaluations[7] = evaluation8;
        evaluations[8] = evaluation9;
        evaluations[9] = evaluation10;
        evaluations[10] = evaluation11;
        evaluations[11] = evaluation12;
        evaluations[12] = evaluation13;
        evaluations[13] = evaluation14;
        evaluations[14] = evaluation15;
        evaluations[15] = evaluation16;
        evaluations[16] = evaluation17;
        evaluations[17] = evaluation18;
        evaluations[18] = evaluation19;
        evaluations[19] = evaluation20;
        evaluations[20] = evaluation21;
        evaluations[21] = evaluation22;
        evaluations[22] = evaluation;
        return evaluations;
    }    
     /**
     * Cria horários
     * @return schedules
     */ 
    private static Schedule[] createSchedules(){
        Schedule schedule = new Schedule(LocalDateTime.of(2018,11,12,12, 0),2.0);
        Schedule schedule1 = new Schedule(LocalDateTime.of(2018,11,13,12, 0),2.0);
        Schedule schedule2 = new Schedule(LocalDateTime.of(2018,11,14,12, 0),2.0);
        Schedule schedule3 = new Schedule(LocalDateTime.of(2018,1,15,12, 0),2.0);
        Schedule schedule4 = new Schedule(LocalDateTime.of(2018,11,16,12, 0),2.0);
        Schedule schedule5 = new Schedule(LocalDateTime.of(2018,11,17,12, 0),2.0);
        Schedule schedule6 = new Schedule(LocalDateTime.of(2018,11,18,12, 0),2.0);
        Schedule schedule7 = new Schedule(LocalDateTime.of(2018,11,19,12, 0),2.0);
        Schedule schedule8 = new Schedule(LocalDateTime.of(2018,11,20,12, 0),2.0);
        Schedule schedule9 = new Schedule(LocalDateTime.of(2018,12,11,12, 0),2.0);
        Schedule schedule10 = new Schedule(LocalDateTime.of(2018,12,15,12, 0),2.0);
        Schedule schedule11 = new Schedule(LocalDateTime.of(2018,12,17,12, 0),2.0);
        Schedule schedule12 = new Schedule(LocalDateTime.of(2018,12,19,12, 0),2.0);
        Schedule schedule13 = new Schedule(LocalDateTime.of(2019,01,05,12, 0),2.0);
        Schedule schedule14 = new Schedule(LocalDateTime.of(2019,01,07,12, 0),2.0);
        Schedule schedule15 = new Schedule(LocalDateTime.of(2019,01,11,12, 0),2.0);
        Schedule schedule16 = new Schedule(LocalDateTime.of(2019,01,12,12, 0),2.0);
        Schedule schedule17 = new Schedule(LocalDateTime.of(2019,01,13,12, 0),2.0);
        Schedule schedule18 = new Schedule(LocalDateTime.of(2019,01,14,12, 0),2.0);
        Schedule schedule19 = new Schedule(LocalDateTime.of(2019,01,15,12, 0),2.0);
        Schedule schedule20 = new Schedule(LocalDateTime.of(2019,01,16,12, 0),2.0);
        Schedule schedule21 = new Schedule(LocalDateTime.of(2019,01,17,12, 0),2.0);
        Schedule schedule22 = new Schedule(LocalDateTime.of(2019,01,18,12, 0),2.0);
        Schedule schedule23 = new Schedule(LocalDateTime.of(2019,01,19,12, 0),2.0);
         
        Schedule[] schedules = new Schedule[25];
        schedules[0] = schedule;
        schedules[1] = schedule1;
        schedules[2] = schedule2;
        schedules[3] = schedule3;
        schedules[4] = schedule4;
        schedules[5] = schedule5;
        schedules[6] = schedule6;
        schedules[7] = schedule7;
        schedules[8] = schedule8;
        schedules[9] = schedule9;
        schedules[10] = schedule10;
        schedules[11] = schedule11;
        schedules[12] = schedule12;
        schedules[13] = schedule13;
        schedules[14] = schedule14;
        schedules[15] = schedule15;
        schedules[16] = schedule16;
        schedules[17] = schedule17;
        schedules[18] = schedule18;
        schedules[19] = schedule19;
        schedules[20] = schedule20;
        schedules[21] = schedule21;
        schedules[22] = schedule22;
        schedules[23] = schedule23;
        return schedules;
    }
     /**
     * Cria professores
     * @param classrooms
     * @param schedules
     * @return instructors
     */ 
    private static Instructor[] createInstructors(Classroom[] classrooms,Schedule[] schedules){
        Instructor instructor = new Instructor("Afonso","afonso@hotmail.com",classrooms[0],schedules);
        Instructor instructor1 = new Instructor("Marina","Marina@hotmail.com",classrooms[0],schedules);
        Instructor instructor2 = new Instructor("Florinda","Florinda@hotmail.com",classrooms[0],schedules);
        Instructor instructor3 = new Instructor("Vera","Vera@hotmail.com",classrooms[0],schedules);
        Instructor instructor4 = new Instructor("Eduardo","Eduardo@hotmail.com",classrooms[0],schedules);
        Instructor instructor5 = new Instructor("Dinis","Dinis@hotmail.com",classrooms[0],schedules);
        Instructor instructor6 = new Instructor("Elizabete","Elizabete@hotmail.com",classrooms[0],schedules);
        Instructor instructor7 = new Instructor("Cláudio","Cláudio@hotmail.com",classrooms[0],schedules);
        Instructor instructor8 = new Instructor("Bruno","Bruno@hotmail.com",classrooms[0],schedules);
        Instructor instructor9 = new Instructor("Gonçalo","Gonçalo@hotmail.com",classrooms[0],schedules);
        Instructor instructor10 = new Instructor("Costa","Costa@hotmail.com",classrooms[0],schedules);
         
        Instructor[] instructors= new Instructor[11];
        instructors[0] = instructor;
        instructors[1] = instructor1;
        instructors[2] = instructor2;
        instructors[3] = instructor3;
        instructors[4] = instructor4;
        instructors[5] = instructor5;
        instructors[6] = instructor6;
        instructors[7] = instructor7;
        instructors[8] = instructor8;
        instructors[9] = instructor9;
        instructors[10] = instructor10;
        return instructors;
    }
     /**
     * Cria cursos
     * @return courses
     */ 
    private static Course[] createCourses(){
        Course leaci = new Course("Engenharia de Automação, Controlo e Instrumentação",CourseType.GRADUATION);
        Course leec = new Course("Engenharia Eletrotécnica e de Computadores",CourseType.GRADUATION);
        Course lei = new Course("Engenharia Informática",CourseType.GRADUATION);
        Course lem = new Course("Engenharia Mecânica",CourseType.GRADUATION);
        Course ltb = new Course("Tecnologia Biomédica",CourseType.GRADUATION);
        Course lte = new Course("Tecnologias de Energia",CourseType.GRADUATION);
        Course ltgi = new Course("Tecnologia e Gestão Industrial",CourseType.GRADUATION);
        Course ltam = new Course("Tecnologia do Ambiente e do Mar",CourseType.GRADUATION);
        Course mes = new Course("Engenharia de Software",CourseType.MASTER_DEGREE);
        Course meec = new Course("Engenharia Eletrotécnica e de Computadores",CourseType.MASTER_DEGREE);
        Course mep = new Course("Engenharia de Produção",CourseType.MASTER_DEGREE);
        Course mig = new Course("Informática de Gestão",CourseType.MASTER_DEGREE);
        Course msht = new Course("Segurança e Higiene no Trabalho",CourseType.MASTER_DEGREE);
        Course pei = new Course("Engenharia Informática",CourseType.POSTGRADUATE_STUDIES);
        Course pmveh = new Course("Motorizção de Veículos Elétricos e Híbridos",CourseType.POSTGRADUATE_STUDIES);
        Course ppa = new Course("Produção Aeronáutica",CourseType.POSTGRADUATE_STUDIES);
        
        Course[] courses = new Course[17];
        courses[0] = leaci;
        courses[1] = leec;
        courses[2] = lei;
        courses[3] = lem;
        courses[4] = ltb;
        courses[5] = lte;
        courses[6] = ltgi;
        courses[7] = ltam;
        courses[8] = mes;
        courses[9] = meec;
        courses[10] = mep;
        courses[11] = mig;
        courses[12] = msht;
        courses[13] = pei;
        courses[14] = pmveh;
        courses[15] = ppa;
        return courses;
        
    }
         /**
     * Cria alunos
     * @param courses
     * @return students
     */ 
    private static Student[] createStudents(Course[] courses){
        Student student = new Student("Afonso",LocalDate.of(1998,10,10),'H',courses[0]);
        Student student1 = new Student("Ana",LocalDate.of(1997,1,10),'F',courses[1]);
        Student student2 = new Student("Clara",LocalDate.of(1999,12,25),'F',courses[2]);
        Student student3 = new Student("João",LocalDate.of(1998,5,13),'H',courses[3]);
        Student student4 = new Student("Dinis",LocalDate.of(1998,7,7),'H',courses[4]);
        Student student5 = new Student("Alexandre",LocalDate.of(1998,11,24),'H',courses[5]);
        Student student6 = new Student("André",LocalDate.of(1998,4,17),'H',courses[6]);
        Student student7 = new Student("Bruna",LocalDate.of(1998,2,19),'F',courses[7]);
        Student student8 = new Student("Carolina",LocalDate.of(1998,3,1),'F',courses[8]);
        Student student9 = new Student("Sofia",LocalDate.of(1998,10,9),'F',courses[9]);
        Student student10 = new Student("Sara",LocalDate.of(1998,9,10),'F',courses[10]);
        Student student11 = new Student("Bernado",LocalDate.of(1999,6,15),'H',courses[11]);
        Student student12 = new Student("Eugenio",LocalDate.of(1998,3,21),'H',courses[12]);
        Student student13 = new Student("Miguel",LocalDate.of(1998,5,22),'H',courses[13]);
        Student student14 = new Student("Almeirim",LocalDate.of(1997,8,12),'H',courses[14]);
        Student student15 = new Student("Luis",LocalDate.of(1998,10,11),'H',courses[15]);
        Student student16 = new Student("Martim",LocalDate.of(1995,1,16),'H',courses[0]);
        Student student17 = new Student("Rafael",LocalDate.of(1998,4,12),'H',courses[1]);
        Student student18 = new Student("Lisa",LocalDate.of(1998,12,11),'F',courses[2]);
        Student student19 = new Student("Ana Sofia",LocalDate.of(1996,11,23),'F',courses[3]);
        Student student20 = new Student("Duarte",LocalDate.of(1998,5,27),'H',courses[4]);
        Student student21 = new Student("Tomás",LocalDate.of(1998,7,28),'H',courses[5]);
        Student student22 = new Student("Lucia",LocalDate.of(1998,3,05),'F',courses[6]);
        Student student23 = new Student("Ailton",LocalDate.of(1998,2,9),'H',courses[7]);
        Student student24 = new Student("Hélder",LocalDate.of(1998,10,8),'H',courses[8]);
        
        Student[] students = new Student[25];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        students[5] = student5;
        students[6] = student6;
        students[7] = student7;
        students[8] = student8;
        students[9] = student9;
        students[10] = student10;
        students[11] = student11;
        students[12] = student12;
        students[13] = student13;
        students[14] = student14;
        students[15] = student15;
        students[16] = student16;
        students[17] = student17;
        students[18] = student18;
        students[19] = student19;
        students[20] = student20;
        students[21] = student21;
        students[22] = student22;
        students[23] = student23;
        students[24] = student24;
        return students;
    }
         /**
     * Cria aulas  
     * @param instructors
     * @param classrooms
     * @return ucClasses
     */ 
    private static UCClass[] createUCClasses(Instructor[] instructors,Classroom[] classrooms){
        UCClass ucClass = new UCClass(LocalDateTime.of(2018,11,4,10,30),LocalDateTime.of(2018,11,4,12,0),instructors[0],classrooms[0],ClassroomType.THEORY);
        UCClass ucClass1 = new UCClass(LocalDateTime.of(2018,12,4,10,30),LocalDateTime.of(2018,12,4,12,0),instructors[5],classrooms[2],ClassroomType.LAB);
        UCClass ucClass2 = new UCClass(LocalDateTime.of(2019,1,4,14,0),LocalDateTime.of(2019,1,4,16,0),instructors[1],classrooms[1],ClassroomType.TUTORIALS);
        UCClass ucClass3 = new UCClass(LocalDateTime.of(2019,1,5,10,30),LocalDateTime.of(2019,1,5,12,0),instructors[6],classrooms[5],ClassroomType.THEORY);
        UCClass ucClass4 = new UCClass(LocalDateTime.of(2018,10,25,10,30),LocalDateTime.of(2018,10,25,12,0),instructors[1],classrooms[1],ClassroomType.THEORY);
        UCClass ucClass5 = new UCClass(LocalDateTime.of(2018,12,2,10,30),LocalDateTime.of(2018,12,3,12,0),instructors[7],classrooms[4],ClassroomType.THEORY);
        UCClass ucClass6 = new UCClass(LocalDateTime.of(2018,12,16,10,30),LocalDateTime.of(2018,12,16,12,0),instructors[10],classrooms[5],ClassroomType.THEORY);
        UCClass ucClass7 = new UCClass(LocalDateTime.of(2019,1,3,10,30),LocalDateTime.of(2019,1,3,12,0),instructors[0],classrooms[0],ClassroomType.THEORY);
        UCClass ucClass8 = new UCClass(LocalDateTime.of(2019,1,7,10,30),LocalDateTime.of(2019,1,7,12,0),instructors[0],classrooms[0],ClassroomType.THEORY);
        UCClass ucClass9 = new UCClass(LocalDateTime.of(2019,1,10,10,30),LocalDateTime.of(2019,1,10,12,0),instructors[0],classrooms[0],ClassroomType.THEORY);
        UCClass ucClass10 = new UCClass(LocalDateTime.of(2019,1,23,10,30),LocalDateTime.of(2019,1,23,12,0),instructors[0],classrooms[0],ClassroomType.THEORY);
        
        UCClass[] classes = new UCClass[11];
        classes[0] = ucClass;
        classes[1] = ucClass1;
        classes[2] = ucClass2;
        classes[3] = ucClass3;
        classes[4] = ucClass4;
        classes[5] = ucClass5;
        classes[6] = ucClass6;
        classes[7] = ucClass7;
        classes[8] = ucClass8;
        classes[9] = ucClass9;
        classes[10] = ucClass10;
        return classes;
    }
     /**
     * Cria UCs
     * @param classes
     * @param evaluations
     * @return ucs
     */ 
    private static UC[] createUcs(UCClass[] classes,Evaluation[] evaluations){
        UC uc = new UC("Matemática",1,6,classes,evaluations);
        UC uc1 = new UC("IPOO",2,6,classes,evaluations);
        UC uc2 = new UC("LC",1,6,classes,evaluations);
        UC uc3 = new UC("ATAD",1,6,classes,evaluations);
        UC uc4 = new UC("MEC",1,6,classes,evaluations);
        UC uc5 = new UC("Economia Gestão",1,6,classes,evaluations);
        UC uc6 = new UC("BD",1,6,classes,evaluations);
        
        UC[] ucs = new UC[7];
        ucs[0] = uc;
        ucs[1] = uc1;
        ucs[2] = uc2;
        ucs[3] = uc3;
        ucs[4] = uc4;
        ucs[5] = uc5;
        ucs[6] = uc6;
        return ucs;
    }
    /**
     * Cria grupos
     * @param ucs
     * @param students
     * @return groups
     */ 
    private static Group[] createGroups(UC[] ucs,Student[] students){
        Group group = new Group(ucs[0],students);
        Group group1 = new Group(ucs[2],students);
        Group group2 = new Group(ucs[3],students);
        Group group3 = new Group(ucs[4],students);
        Group group4 = new Group(ucs[5],students);
        Group group5 = new Group(ucs[6],students);
        
        Group[] groups = new Group[6];
        groups[0] = group;
        groups[1] = group1;
        groups[2] = group2;
        groups[3] = group3;
        groups[4] = group4;
        groups[5] = group5;
        return groups;
    }
}
