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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Emil
 */
@Entity
public class Address implements Serializable {

    @OneToMany(mappedBy = "Address", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<InfoEntity> infoEntity;
    
    @ManyToOne
    private CityInfo cityinfo;
    
    private static final long serialVersionUID = 1L;
    @Id

    private String Street;
    private String AdditionalInfo;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String AdditionalInfo) {
        this.AdditionalInfo = AdditionalInfo;
    }
    
    
    
    

}
