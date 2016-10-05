/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diana
 */
public interface ICompanyFacade {

    void addEntityManagerFactory(EntityManagerFactory emf);

    public Company addCompany(Company c);

    public Company deleteCompany(int id);

    public Company getCompany(int id);

    public List<Company> getCompany();

    public Company editCompany(int id);

}
