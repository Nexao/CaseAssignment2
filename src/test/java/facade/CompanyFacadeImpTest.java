package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class CompanyFacadeImpTest {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
    private static ICompanyFacade cfacade = new CompanyFacadeImp(emf);

    public CompanyFacadeImpTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testAddCompany() {
        Company c;
        c = new Company("name", "description", "cvr", 2, 100_000);
        Company result = cfacade.addCompany(c);
        assertNotNull(result.getCvr());
        EntityManager em = emf.createEntityManager();
        try {
            Company result2 = em.find(Company.class, result.getCvr());
            assertEquals("fname", result2.getCvr());
        } finally {
            em.close();
        }
    }

    @Test
    public void testDeleteCompany() {
        EntityManager em = emf.createEntityManager();
        Company c = em.find(Company.class, 1);
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        em.close();
    }

    @Test
    public void testGetallCompany() {
        List<Company> company = cfacade.getCompany();
        assertEquals(2, company.size());
    }

    @Test
    public void testEditCompany() {
        EntityManager em = emf.createEntityManager();
        Company c = cfacade.getCompany(1);
        TestCase.assertEquals("company name", c.getName());
        c.setName("test company");
        cfacade.editCompany(c);
        Company cv = cfacade.getCompany(1);
        TestCase.assertEquals("name should be test company", cv.getName());
//        Company c = em.find(Company.class, 1);
//        em.getTransaction().begin();
//        em.setProperty("hahaha", c);
//        em.getTransaction().commit();
//        em.close();
    }
}
