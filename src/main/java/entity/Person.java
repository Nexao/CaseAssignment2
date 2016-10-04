package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author koh
 */
@Entity
@Table(name = "person")
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE p.fName = :fName"),
    @NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE p.lName = :lName"),
    @NamedQuery(name = "Person.findByDescription", query = "SELECT p FROM Person p WHERE p.hobbyName = :hobbyName"),
    @NamedQuery(name = "Person.findByDescription", query = "SELECT p FROM Person p WHERE p.hobbyDescription = :hobbyDescription"),
})
public class Person extends InfoEntity {

    @Size(max = 45)
    @Column(name = "FirstName")
    private String fName;
    
    @Size(max = 45)
    @Column(name = "LastName")
    private String lName;
    
    @Size(max = 20)
    @Column(name = "Hobby")
    private String hobbyName;
    
    @Size(max = 100)
    @Column(name = "HobbyDescription")
    private String hobbyDescription;

    public Person() {
    }
     
    public Person(String fName, String lName, String hobbyName, String hobbyDescription) {
        this.fName = fName;
        this.lName = lName;
        this.hobbyName = hobbyName;
        this.hobbyDescription = hobbyDescription;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getDescription() {
        return hobbyDescription;
    }

    public void setDescription(String description) {
        this.hobbyDescription = description;
    }
     
     
    
}
