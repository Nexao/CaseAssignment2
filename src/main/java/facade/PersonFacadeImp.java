package facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entity.InfoEntity;
import entity.Person;
import static entity.development.InfoEntity_.person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.metamodel.SingularAttribute;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author jarmo
 */
public class PersonFacadeImp implements IPersonFacade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public PersonFacadeImp(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonFacadeImp getPersonsInCity(String city, int zip) {

        return null;
    }
    
    @Override
    public Person addPerson(Person p) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public Person deletePerson(int id) throws Exception {
        EntityManager em = getEntityManager();
        Person per = em.find(Person.class, id);
        try {
            em.getTransaction().begin();
            em.remove(per);
            em.getTransaction().commit();
            return per;
        } finally {
            em.close();
        }
    }

    @Override
    public Person getPerson(int id) throws Exception {
        //Person c = new Person();
        EntityManager em = getEntityManager();
        Person person = em.find(Person.class, id);
        try {

            //            Query query = em.createQuery("SELECT  p FROM Person p where Person p.id = :id");
            //            Person c = (Person) query.getSingleResult();
            return person;
        }
        catch (Exception ex) 
        {
            throw new WebApplicationException("Something went wrong");   
        }
        finally {
            em.close();
        }
        
    }

    @Override
    public List<Person> getPersons() throws Exception{
        EntityManager em = getEntityManager();
//        Query query = em.createQuery("SELECT e FROM Person e");
//        return (List<Person>) query.getResultList();
        try {
            Query query = em.createQuery("select p from Person p");
            System.out.println("Did the qu");
            List<Person> persons = query.getResultList();
        
            if(persons!= null)
            System.out.println("Got Persons: " + persons.size());
            else
            System.out.println("Got NULL");
        return  persons;
        }
        finally{
          em.close();
        }
       
    }
    
    // NOT READY
    @Override
    public List<Person> getAllContactInfo() throws Exception {
        EntityManager em = getEntityManager();
        try {
            // getting person contact info via infoEntity table
            Query query = em.createQuery("select Phonenumber, address_street, Person.* from infoentity inner join Person where person_id =:id");
            List<Person> persons = query.getResultList();
            return persons;
        } finally {
            em.close();
        }
    }

    @Override
    public Person editPerson(int id) throws Exception {
        EntityManager em = getEntityManager();
        Person per = em.find(Person.class, id);
        String fname = per.getfName();
        String lname = per.getlName();
        String hobby = per.getHobbyName();
        String description = per.getDescription();
        Query query = em.createQuery("update Person p set fName = " + fname + ",lName = " + lname + ", hobbyName= " + hobby + ", hobbyDescription= " + description + " where id = " + id);
        try {
            em.getTransaction().begin();
            em.refresh(query);
            em.getTransaction().commit();
            return per;
        } finally {
            em.close();
        }
    }

}
