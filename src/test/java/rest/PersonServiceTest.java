    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hh
 */
public class PersonServiceTest {
    
    public PersonServiceTest() {
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
     * Test of getPersons method, of class PersonService.
     */
    @Test
    public void testGetPersons() throws Exception {
        System.out.println("getPersons");
        PersonService instance = new PersonService();
        String expResult = "";
        String result = instance.getPersons();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPerson method, of class PersonService.
     */
    @Test
    public void testGetPerson() throws Exception {
        System.out.println("getPerson");
        int id = 0;
        PersonService instance = new PersonService();
        String expResult = "";
        String result = instance.getPerson(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllContactInfo method, of class PersonService.
     */
    @Test
    public void testGetAllContactInfo() throws Exception {
        System.out.println("getAllContactInfo");
        PersonService instance = new PersonService();
        String expResult = "";
        String result = instance.getAllContactInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPerson method, of class PersonService.
     */
    @Test
    public void testAddPerson() throws Exception {
        System.out.println("addPerson");
        String personJsonStr = "";
        PersonService instance = new PersonService();
        String expResult = "";
        String result = instance.addPerson(personJsonStr);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletePerson method, of class PersonService.
     */
    @Test
    public void testDeletePerson() throws Exception {
        System.out.println("deletePerson");
        int id = 0;
        PersonService instance = new PersonService();
        String expResult = "";
        String result = instance.deletePerson(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of editPerson method, of class PersonService.
     */
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        String content = "";
        PersonService instance = new PersonService();
        instance.editPerson(content);
    }
    
}
