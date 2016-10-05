package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "AddressInfo")
@NamedQueries({
    @NamedQuery(name = "AddressInfo.findAll", query = "SELECT a FROM AddressInfo a"),
    @NamedQuery(name = "AddressInfo.findByZipCode", query = "SELECT a FROM AddressInfo a WHERE a.zipCode = :zipCode"),
    @NamedQuery(name = "AddressInfo.findByCity", query = "SELECT a FROM AddressInfo a WHERE a.city = :city"),
    @NamedQuery(name = "AddressInfo.findByStreet", query = "SELECT a FROM AddressInfo a WHERE a.street = :street")})
public class AddressInfo implements Serializable{
    
    @OneToMany(mappedBy = "addressInfo")
    private Collection<InfoEntity> infoEntity;
    
    @Id 
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zipCode")
    private Integer zipCode;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "AdditionalInfo")
    private String additionalInfo;
    public AddressInfo() {
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}