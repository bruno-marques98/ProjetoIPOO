/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import classes.Agender;
import classes.ClassType;
import classes.Classroom;
import classes.Evaluation;
import classes.EvaluationType;
import classes.Group;
import classes.Instructor;
import classes.Schedule;
import classes.Student;
import classes.UC;
import classes.UCClass;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class ViewerTest {
    
    public ViewerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAgender method, of class Viewer.
     */
    @Test
    public void testAddAgender() {
        System.out.println("addAgender");
        Agender agender = null;
        Viewer instance = new Viewer();
        boolean expResult = false;
        boolean result = instance.addAgender(agender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInstructor method, of class Viewer.
     */
    @Test
    public void testAddInstructor() {
        System.out.println("addInstructor");
        Instructor ins = null;
        Viewer instance = new Viewer();
        boolean expResult = false;
        boolean result = instance.addInstructor(ins);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEvaluation method, of class Viewer.
     */
    @Test
    public void testAddEvaluation() {
        System.out.println("addEvaluation");
        Evaluation evaluation = null;
        Viewer instance = new Viewer();
        boolean expResult = false;
        boolean result = instance.addEvaluation(evaluation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addClassroom method, of class Viewer.
     */
    @Test
    public void testAddClassroom() {
        System.out.println("addClassroom");
        Classroom room = null;
        Viewer instance = new Viewer();
        boolean expResult = false;
        boolean result = instance.addClassroom(room);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class Viewer.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student std = null;
        Viewer instance = new Viewer();
        boolean expResult = false;
        boolean result = instance.addStudent(std);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgender method, of class Viewer.
     */
    @Test
    public void testGetAgender() {
        System.out.println("getAgender");
        Viewer instance = new Viewer();
        Agender expResult = null;
        Agender result = instance.getAgender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstructors method, of class Viewer.
     */
    @Test
    public void testGetInstructors() {
        System.out.println("getInstructors");
        Viewer instance = new Viewer();
        ArrayList<Instructor> expResult = null;
        ArrayList<Instructor> result = instance.getInstructors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class Viewer.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Viewer instance = new Viewer();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassrooms method, of class Viewer.
     */
    @Test
    public void testGetClassrooms() {
        System.out.println("getClassrooms");
        Viewer instance = new Viewer();
        ArrayList<Classroom> expResult = null;
        ArrayList<Classroom> result = instance.getClassrooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluations method, of class Viewer.
     */
    @Test
    public void testGetEvaluations_0args() {
        System.out.println("getEvaluations");
        Viewer instance = new Viewer();
        ArrayList<Evaluation> expResult = null;
        ArrayList<Evaluation> result = instance.getEvaluations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showGroups method, of class Viewer.
     */
    @Test
    public void testShowGroups() {
        System.out.println("showGroups");
        int studentNumber = 0;
        ArrayList<Group> groups = null;
        Viewer instance = new Viewer();
        instance.showGroups(studentNumber, groups);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekSchedule method, of class Viewer.
     */
    @Test
    public void testGetWeekSchedule() {
        System.out.println("getWeekSchedule");
        int numberOfWeek = 0;
        Viewer instance = new Viewer();
        ArrayList<Schedule> expResult = null;
        ArrayList<Schedule> result = instance.getWeekSchedule(numberOfWeek);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaySchedule method, of class Viewer.
     */
    @Test
    public void testGetDaySchedule() {
        System.out.println("getDaySchedule");
        int dayOfMonth = 0;
        int month = 0;
        Viewer instance = new Viewer();
        ArrayList<Schedule> expResult = null;
        ArrayList<Schedule> result = instance.getDaySchedule(dayOfMonth, month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluations method, of class Viewer.
     */
    @Test
    public void testGetEvaluations_UC() {
        System.out.println("getEvaluations");
        UC uc = null;
        Viewer instance = new Viewer();
        ArrayList<Evaluation> expResult = null;
        ArrayList<Evaluation> result = instance.getEvaluations(uc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstructorsSchedule method, of class Viewer.
     */
    @Test
    public void testGetInstructorsSchedule() {
        System.out.println("getInstructorsSchedule");
        String ucId = "";
        Viewer instance = new Viewer();
        ArrayList<Schedule> expResult = null;
        ArrayList<Schedule> result = instance.getInstructorsSchedule(ucId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasses method, of class Viewer.
     */
    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        String classroomName = "";
        Viewer instance = new Viewer();
        ArrayList<UCClass> expResult = null;
        ArrayList<UCClass> result = instance.getClasses(classroomName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUCs method, of class Viewer.
     */
    @Test
    public void testGetUCs() {
        System.out.println("getUCs");
        Viewer instance = new Viewer();
        ArrayList<UC> expResult = null;
        ArrayList<UC> result = instance.getUCs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberOfHoursClassType method, of class Viewer.
     */
    @Test
    public void testNumberOfHoursClassType() {
        System.out.println("numberOfHoursClassType");
        ClassType type = null;
        Viewer instance = new Viewer();
        int expResult = 0;
        int result = instance.numberOfHoursClassType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberOfHoursEvaluationType method, of class Viewer.
     */
    @Test
    public void testNumberOfHoursEvaluationType() {
        System.out.println("numberOfHoursEvaluationType");
        EvaluationType type = null;
        Viewer instance = new Viewer();
        int expResult = 0;
        int result = instance.numberOfHoursEvaluationType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
