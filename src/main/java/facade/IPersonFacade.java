package facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author jarmo
 */
public interface IPersonFacade {

    void addEntityManagerFactory(EntityManagerFactory emf);

        public Person addPerson(Person p) throws Exception;

        public Person deletePerson(int id) throws Exception;

        public Person getPerson(int id) throws Exception;

        public List<Person> getPersons() throws Exception;

        public Person editPerson(int id) throws Exception;
        
        public List<Person> getAllContactInfo() throws Exception;
    
}
