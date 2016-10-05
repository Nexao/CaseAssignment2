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

        public Person addPerson(Person p);

        public Person deletePerson(int id);

        public Person getPerson(int id);

        public List<Person> getPersons();

        public Person editPerson(Person p);
    
}
