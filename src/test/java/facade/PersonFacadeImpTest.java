//package facade;
//
//import entity.Person;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Diana
// */
//public class PersonFacadeImpTest {
//
//    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
//    private static IPersonFacade facade = new PersonFacadeImp(emf);
////
//    public PersonFacadeImpTest() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @Test
//    public void testGetPersonsInCity() {
//        System.out.println("getPersonsInCity");
//    }
//
//    @Test
//    public void testAddPerson() throws Exception {
//        Person p = new Person("fname", "lname", "hobbyname", "");
//        Person result = facade.addPerson(p);
//        assertNotNull(result.getlName());
//        EntityManager em = emf.createEntityManager();
//        try {
//            Person result2 = em.find(Person.class, result.getlName());
//            assertEquals("fname", result2.getfName());
//        } 
//        finally {
//            em.close();
//        } 
//        
//    }
//    
//    @Test
//    public void testDeletePerson() throws Exception
//    {
//        Person newPer = new Person("JAB","AtheHt","Ballet","blablabla");  // I create a new person
//        Person result = facade.addPerson(newPer);                      // I pass the person tthrough the facade
//        EntityManager em = emf.createEntityManager();
//        Person person = em.find(Person.class, result.getId());             // I find the ID of the person
//        try{
//            em.getTransaction().begin();
//            em.remove(person);                                              // I remove person with that id
//            em.getTransaction().commit();      
//        }
//        finally{
//            em.close();
//        }
//        assertEquals(person, null);                                         // I ask if the person id is equal to null.S
//        //assertEquals(person, result);   
//    }
//   
//
//    @Test
//    public void testGetPerson() {
//        System.out.println("getPerson");
//    }
//
//    @Test
//    public void testGetPersons() throws Exception {
//        Person newPer = new Person("aa","aa","aa","aa");
////        Person newPer2 = new Person("ss","ss","ss","ss");
////        Person result = facade.add(newPer);
//        
//        List<Person> persons = facade.getPersons();
//        assertEquals(2, persons.size());
//    }
//
//    @Test
//    public void testEditPerson() {
//        System.out.println("editPerson");
//    }
//
//}
