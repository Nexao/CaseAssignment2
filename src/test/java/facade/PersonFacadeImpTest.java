package facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class PersonFacadeImpTest {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
    private static IPersonFacade facade = new PersonFacadeImp(emf);

    public PersonFacadeImpTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetPersonsInCity() {
        System.out.println("getPersonsInCity");
        String city = "";
        int zipCode = 0;
        PersonFacadeImp instance = null;
        PersonFacadeImp expResult = null;
        PersonFacadeImp result = instance.getPersonsInCity(city, zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddPerson() {
        Person p = new Person("fname", "lname", "hobbyname", "");
        Person result = facade.addPerson(p);
        assertNotNull(result.getId());
        EntityManager em = emf.createEntityManager();
        try {
            Person result2 = em.find(Person.class, result.getId());
            assertEquals("fname", result2.getfName());
        } finally {
            em.close();
        }
    }

    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 0;
        PersonFacadeImp instance = null;
        Person expResult = null;
        Person result = instance.deletePerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int zipCode = 0;
        PersonFacadeImp instance = null;
        Person expResult = null;
        Person result = instance.getPerson(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPersons() {
        List<Person> persons = facade.getPersons();
        assertEquals(2, persons.size());
    }

    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        Person p = null;
        PersonFacadeImp instance = null;
        Person expResult = null;
        Person result = instance.editPerson(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
