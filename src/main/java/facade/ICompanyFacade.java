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

    void addEntityManagerFactory(EntityManagerFactory emf) throws Exception;

    public Company addCompany(Company c) throws Exception;

    public Company deleteCompany(int id) throws Exception;

    public Company getCompany(int id) throws Exception;

    public List<Company> getAllCompany() throws Exception;

    public Company editCompany(int id) throws Exception;

}
