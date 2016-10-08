/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
<<<<<<< HEAD
import javax.persistence.Table;
import org.eclipse.persistence.jpa.config.Cascade;
=======
>>>>>>> f7de14007bdf16d30967453e676304d15bd4c43d

/**
 *
 * @author Emil
 */
@Entity
@Table(name="cityinfo")
public class CityInfo implements Serializable {

    @OneToMany(mappedBy = "cityinfo", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Address> address;
    
    private static final long serialVersionUID = 1L;
    @Id

    private String Zip;
    private String City;

    public CityInfo() {
    }

    public CityInfo(String zip, String city) {
        this.Zip = zip;
        this.City = city;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        this.Zip = zip;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }
    

}
