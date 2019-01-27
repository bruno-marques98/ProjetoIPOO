/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de testes à classe Agender
 * @author Bruno_170221059;Gonçalo_180221046
 */
public class AgenderTest {
    private static Agender agender;
    private UC uc;
    private Instructor ins;
    private Classroom classroom;
    private Group group;
    private Schedule schedule;
    
    public AgenderTest() {
    }
    
    @Before
    public void setUp() {
        agender = new Agender(LocalDate.of(2018,10,1),LocalDate.of(2019,01,30),true);
        uc = new UC("Matemática",45,6);
        UCClass ucRoom = new UCClass();
        uc.addClass(ucRoom);
        ins = new Instructor("Test instructor","test@gmail.com",new Classroom('A',101,50));
        classroom = new Classroom('A',101,50);
        group = new Group();
        schedule = new Schedule();
        agender.addSchedule(schedule);
        agender.addGroup(group);
        agender.addUC(uc);
        agender.addInstructor(ins);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addUC method, of class Agender.
     */
    @Test
    public void testAddUC() {
        UC uc = new UC("Inglês",42,6);
        assertEquals(true, agender.addUC(uc));
    }

    /**
     * Test of addGroup method, of class Agender.
     */
    @Test
    public void testAddGroup() {
        Group group = new Group();
        assertEquals(true, agender.addGroup(group));
    }
    /**
     * Test of addGroup method, of class Agender.
     */
    @Test
    public void testAddSchedule() {
        Schedule schedule = new Schedule();
        assertEquals(true, agender.addSchedule(schedule));
    }

    /**
     * Test of addInstructor method, of class Agender.
     */
    @Test
    public void testAddInstructor() {
        Instructor ins = new Instructor("Alguem","alguem@gmail.com",classroom);
        assertEquals(true,agender.addInstructor(ins));
    }

    /**
     * Test of totalCredits method, of class Agender.
     */
    @Test
    public void testTotalCredits() {
        assertEquals(6, agender.totalCredits());
    }

    /**
     * Test of totalHours method, of class Agender.
     */
    @Test
    public void testTotalHours() {

        assertEquals(2.0, agender.totalHours(), 0.0);
    }

    /**
     * Test of getNumberWeeks method, of class Agender.
     */
    @Test
    public void testGetNumberWeeks() {
        assertEquals(17, agender.getNumberWeeks());
    }

    /**
     * Test of setClassEveryWeek method, of class Agender.
     */
    @Test
    public void testSetClassEveryWeek() {
        Schedule sch = new Schedule(LocalDateTime.of(2018,10,2,10, 0, 0, 0),1.0);
        assertEquals(true,agender.setClassEveryWeek(sch));
    }


    
}
