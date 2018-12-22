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
import projetoipoo.Agender;
import projetoipoo.Classroom;
import projetoipoo.Course;
import projetoipoo.CourseType;
import projetoipoo.Evaluation;
import projetoipoo.EvaluationType;
import projetoipoo.Instructor;
import projetoipoo.Schedule;
import projetoipoo.Student;
import projetoipoo.UC;

/**
 *
 * @author bruno
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
         
         Evaluation evaluation = new Evaluation(EvaluationType.TEST,"Teste",class1);
         Evaluation evaluation1 = new Evaluation(EvaluationType.TEST,"Teste",class1);
         Evaluation evaluation2 = new Evaluation(EvaluationType.TEST,"Teste",class5);
         Evaluation evaluation3 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",class3);
         Evaluation evaluation4 = new Evaluation(EvaluationType.TEST,"Teste",class2);
         Evaluation evaluation5 = new Evaluation(EvaluationType.TEST,"Teste",class8);
         Evaluation evaluation6 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",class4);
         Evaluation evaluation7 = new Evaluation(EvaluationType.TEST,"Teste",class5);
         Evaluation evaluation8 = new Evaluation(EvaluationType.TEST,"Teste",class7);
         Evaluation evaluation9 = new Evaluation(EvaluationType.PROJECT,"Projeto",class6);
         Evaluation evaluation10 = new Evaluation(EvaluationType.PROJECT,"Projeto",class9);
         Evaluation evaluation11 = new Evaluation(EvaluationType.TEST,"Teste",class7);
         Evaluation evaluation12 = new Evaluation(EvaluationType.TEST,"Teste",class4);
         Evaluation evaluation13 = new Evaluation(EvaluationType.PRESENTATION,"Apresentação",class8);
         Evaluation evaluation14 = new Evaluation(EvaluationType.TEST,"Teste",class1);
         Evaluation evaluation15 = new Evaluation(EvaluationType.TEST,"Teste",class3);
         Evaluation evaluation16 = new Evaluation(EvaluationType.PROJECT,"Projeto",class2);
         Evaluation evaluation17 = new Evaluation(EvaluationType.TEST,"Teste",class6);
         Evaluation evaluation18 = new Evaluation(EvaluationType.TEST,"Teste",class5);
         Evaluation evaluation19 = new Evaluation(EvaluationType.EXAM,"Exame",class2);
         Evaluation evaluation20 = new Evaluation(EvaluationType.EXAM,"Exame",class7);
         Evaluation evaluation21 = new Evaluation(EvaluationType.EXAM,"Exame",class1);
         Evaluation evaluation22 = new Evaluation(EvaluationType.EXAM,"Exame",class3);
         
         Evaluation[] evaluations = new Evaluation[22];
         
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
         
         Instructor instructor = new Instructor("Afonso","afonso@hotmail.com",class1);
         Instructor instructor1 = new Instructor("Marina","Marina@hotmail.com",class1);
         Instructor instructor2 = new Instructor("Florinda","Florinda@hotmail.com",class1);
         Instructor instructor3 = new Instructor("Vera","Vera@hotmail.com",class1);
         Instructor instructor4 = new Instructor("Eduardo","Eduardo@hotmail.com",class1);
         Instructor instructor5 = new Instructor("Dinis","Dinis@hotmail.com",class1);
         Instructor instructor6 = new Instructor("Elizabete","Elizabete@hotmail.com",class1);
         Instructor instructor7 = new Instructor("Cláudio","Cláudio@hotmail.com",class1);
         Instructor instructor8 = new Instructor("Bruno","Bruno@hotmail.com",class1);
         Instructor instructor9 = new Instructor("Gonçalo","Gonçalo@hotmail.com",class1);
         Instructor instructor10 = new Instructor("Costa","Costa@hotmail.com",class1);
         
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
         
         Student student = new Student("Afonso",LocalDate.of(1998,10,10),'H',lei);
         Student student1 = new Student("Ana",LocalDate.of(1997,1,10),'F',leaci);
         Student student2 = new Student("Clara",LocalDate.of(1999,12,25),'F',lei);
         Student student3 = new Student("João",LocalDate.of(1998,5,13),'H',pmveh);
         Student student4 = new Student("Dinis",LocalDate.of(1998,7,7),'H',ltgi);
         Student student5 = new Student("Alexandre",LocalDate.of(1998,11,24),'H',pei);
         Student student6 = new Student("André",LocalDate.of(1998,4,17),'H',lei);
         Student student7 = new Student("Bruna",LocalDate.of(1998,2,19),'F',lei);
         Student student8 = new Student("Carolina",LocalDate.of(1998,3,1),'F',meec);
         Student student9 = new Student("Sofia",LocalDate.of(1998,10,9),'F',lei);
         Student student10 = new Student("Sara",LocalDate.of(1998,9,10),'F',lem);
         Student student11 = new Student("Bernado",LocalDate.of(1999,6,15),'H',msht);
         Student student12 = new Student("Eugenio",LocalDate.of(1998,3,21),'H',lte);
         Student student13 = new Student("Miguel",LocalDate.of(1998,5,22),'H',leec);
         Student student14 = new Student("Almeirim",LocalDate.of(1997,8,12),'H',mep);
         Student student15 = new Student("Luis",LocalDate.of(1998,10,11),'H',lei);
         Student student16 = new Student("Martim",LocalDate.of(1995,1,16),'H',ltam);
         Student student17 = new Student("Rafael",LocalDate.of(1998,4,12),'H',lei);
         Student student18 = new Student("Lisa",LocalDate.of(1998,12,11),'F',ppa);
         Student student19 = new Student("Ana Sofia",LocalDate.of(1996,11,23),'F',lei);
         Student student20 = new Student("Duarte",LocalDate.of(1998,5,27),'H',mig);
         Student student21 = new Student("Tomás",LocalDate.of(1998,7,28),'H',ltb);
         Student student22 = new Student("Lucia",LocalDate.of(1998,3,05),'F',lei);
         Student student23 = new Student("Ailton",LocalDate.of(1998,2,9),'H',lei);
         Student student24 = new Student("Hélder",LocalDate.of(1998,10,8),'H',mes);
         
         Visualizer visualizer = new Visualizer(/*instructors,*/);//Instructor[] instructors, Student[] students, Classroom[] classrooms, Evaluation[] evaluations, Agender agender
         
         
    }
        
        
    
}
