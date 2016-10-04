/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Diana
 */
public class CompanyFacadeImp implements ICompanyFacade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public CompanyFacadeImp(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CompanyFacadeImp() {
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public Company addCompany(Company c) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return c;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Company> getCompany() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("select c from Company c");
            List<Company> company = query.getResultList();
            return company;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompany(int id) {
        Company c = new Company();
        EntityManager em = getEntityManager();
        try {
            Company company = em.find(Company.class, id);
            return company;
        } finally {
            em.close();
        }
    }

    @Override
    public Company deleteCompany(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company editCompany(Company c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
