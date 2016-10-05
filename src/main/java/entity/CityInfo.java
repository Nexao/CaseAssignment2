/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Emil
 */
@Entity
public class CityInfo implements Serializable {

    @OneToMany(mappedBy = "cityinfo")
    private Collection<InfoEntity> infoEntity;
    
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