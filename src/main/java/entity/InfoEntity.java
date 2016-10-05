package entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author jarmo
 */
@Entity
@Table(name = "InfoEntity")
@NamedQueries({
    @NamedQuery(name = "InfoEntity.findAll", query = "SELECT i FROM InfoEntity i"),
    @NamedQuery(name = "InfoEntity.findById", query = "SELECT i FROM InfoEntity i WHERE i.id = :id"),
    @NamedQuery(name = "InfoEntity.findByEmail", query = "SELECT i FROM InfoEntity i WHERE i.email = :email"),
    @NamedQuery(name = "InfoEntity.findByPhonenumber", query = "SELECT i FROM InfoEntity i WHERE i.phoneNumber = :phoneNumber")})
public class InfoEntity implements Serializable 
{
    @ManyToOne
    private AddressInfo addressInfo;
    private Person person;
    private Company company;
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    
    @Size(max = 45)
    @Column(name = "Email")
    private String email;
    
    @Size(max = 45)
    @Column(name = "Phonenumber")
    private String phoneNumber;
    
    public InfoEntity() {
    }
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
