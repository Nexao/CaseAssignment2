package entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jarmo
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "InfoEntity")
//@NamedQueries({
//    @NamedQuery(name = "InfoEntity.findAll", query = "SELECT i FROM InfoEntity i"),
//    @NamedQuery(name = "InfoEntity.findById", query = "SELECT i FROM InfoEntity i WHERE i.id = :id"),
//    @NamedQuery(name = "InfoEntity.findByEmail", query = "SELECT i FROM InfoEntity i WHERE i.email = :email"),
//    @NamedQuery(name = "InfoEntity.findByPhonenumber", query = "SELECT i FROM InfoEntity i WHERE i.phoneNumber = :phoneNumber")})
public class InfoEntity implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    private Person person;
    
    @ManyToOne
    private Company company;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Address address;

    @Size(max = 45)
    @Column(name = "Email")
    private String email;
    
    @Size(max = 45)
    @Column(name = "Phonenumber")
    private String phoneNumber;
    
    public InfoEntity() {
    }
<<<<<<< HEAD
    
=======

    public InfoEntity(Integer id, Person person, Company company, Address address, String email, String phoneNumber) {
        this.id = id;
        this.person = person;
        this.company = company;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

>>>>>>> 00dfaf9c173b9719223fbeebbd1ab9fd6f331473
    public InfoEntity(Integer id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
