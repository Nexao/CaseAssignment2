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
    public Company addCompany(Company c) throws Exception {
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
    public List<Company> getAllCompany() throws Exception {
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
    public Company getCompany(int id) throws Exception {
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
    public Company deleteCompany(int id) throws Exception{
        EntityManager em = getEntityManager();
        //Query query = em.createQuery("select p from Person p wher id = " +':'+ id);
        Company c = em.find(Company.class, id);
        try {
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
            return c;
        } finally {
            em.close();
        }
    }

    @Override
    public Company editCompany(int id) throws Exception {
        EntityManager em = getEntityManager();
        Company company = em.find(Company.class, id);
        try {
            Query query = em.createQuery("UPDATE c from Company c where id = ?");
            em.getTransaction().begin();
            em.refresh(query);
            em.getTransaction().commit();
            return company;
        } finally {
            em.close();
        }
    }
}
