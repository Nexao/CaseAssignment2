package facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

    public PersonFacadeImp getPersonsInCity(String city, int zip) {

        return null;
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Person addPerson(Person p) {
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
    public Person deletePerson(int id) {
        return null;
    }

    @Override
    public Person getPerson(int id) {
        Person c = new Person();
        EntityManager em = getEntityManager();
        try {
            Person person = em.find(Person.class, id);
            return person;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("select p from Person p");
            List<Person> persons = query.getResultList();
            return persons;
        } finally {
            em.close();
        }
    }

    @Override
    public Person editPerson(Person p) {
        return null;
    }

}
