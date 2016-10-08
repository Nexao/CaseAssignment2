//package facade;
//
//import entity.Person;
////import static facade.CompanyFacadeImpTest.emf;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//
//public class PersonFacadeImpTest {
//
//    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
//    private static IPersonFacade facade = new PersonFacadeImp(emf);
//
//    public PersonFacadeImpTest() {
//    }
//
//    @Before
//    public void setUp() {
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
//        Person p = new Person("a","a","a","a");
//        Person result = facade.addPerson(p);
//        
//        EntityManager em = emf.createEntityManager();
//        Person person = em.find(Person.class, result.getId());             
//        try{
//            em.getTransaction().begin();
//            em.remove(person);                                             
//            em.getTransaction().commit();      
//        }
//        finally{
//            em.close();
//        }
//        assertEquals(person, null);                                           
//    }
//   
//    @Test
//    public void testGetPerson() {
//        EntityManager em = emf.createEntityManager();
//        Person person = em.find(Person.class, 1);    
//        assertNotNull(person);
//    }
//    
//    @Test
//    public void testGetPersonsInCity() {
//        System.out.println("getPersonsInCity");
//    }
//
//    @Test
//    public void testGetPersons() throws Exception {
//        Person newPer = new Person("aa","aa","aa","aa");
//        Person newPer2 = new Person("ss","ss","ss","ss");
//        Person result = facade.addPerson(newPer);
//        Person result2 = facade.addPerson(newPer2);
//        
//        List<Person> persons = facade.getPersons();
//        assertEquals(2, persons.size());
//    }
//
//    @Test
//    public void testEditPerson() throws Exception{
//        EntityManager em = emf.createEntityManager();
//        Person person = em.find(Person.class, 1); 
//        String fname = person.getfName();
//        try{
//            em.getTransaction().begin();
//            em.setProperty("hahaha", fname);
//            em.getTransaction().commit();
//        }
//        finally{
//            em.close();
//        }
//              
//        Person nameAfter = em.find(Person.class, person.getfName());
//        assertNotEquals(fname, nameAfter);
//    }
//}
