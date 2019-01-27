/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de teste à classe Student
 * @author Bruno_170221059;Gonçalo_180221046
 */
public class StudentTest {
    private Student std;
    private String name;
    private LocalDate birthDate;
    private char genre;
    private Course course;
    private Agender agender;
    
    public StudentTest() {
    }
    
    
    @Before
    public void setUp() {
        this.name = "Test";
        this.birthDate = LocalDate.of(1998,10,10);
        this.genre = 'M';
        this.course = new Course("Engenharia Informática",CourseType.GRADUATION);
        this.std = new Student(name,birthDate,genre,course);
        this.agender = new Agender(LocalDate.of(2018,10,1),LocalDate.of(2019,01,30),true);
        this.std.addAgender(agender);
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of addAgender method, of class Student.
     */
    @Test
    public void testAddAgender() {
        Agender ag = new Agender(LocalDate.of(2021,01,01),LocalDate.of(2021,04,29),false);
        assertEquals(true,std.addAgender(ag));
    }


    /**
     * Test of addUC method, of class Student.
     * By testing this method, the method getActiveAgender is tested too
     */
    @Test
    public void testAddUC() {
        UC uc = new UC("TestSubject",12,50);
        assertEquals(true,std.addUC(uc));
    }


    
}
