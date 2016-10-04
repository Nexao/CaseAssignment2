package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class CompanyFacadeImpTest {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
    private static IPersonFacade facade = new PersonFacadeImp(emf);
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
        assertNotNull(result.getId());
        EntityManager em = emf.createEntityManager();
        try {
            Company result2 = em.find(Company.class, result.getId());
            assertEquals("fname", result2.getCvr());
        } finally {
            em.close();
        }
    }


    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        int id = 0;
        CompanyFacadeImp instance = new CompanyFacadeImp();
        Company expResult = null;
        Company result = instance.deleteCompany(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetallCompany() {
        List<Company> company = cfacade.getCompany();
        assertEquals(2, company.size());
    }

    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
        Company c = null;
        CompanyFacadeImp instance = new CompanyFacadeImp();
        Company expResult = null;
        Company result = instance.editCompany(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
