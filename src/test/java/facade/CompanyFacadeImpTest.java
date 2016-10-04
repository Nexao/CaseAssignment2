package facade;

import entity.Company;
import java.util.List;
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

    public CompanyFacadeImpTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testAddCompany() {
        System.out.println("addCompany");
        Company c = null;
        CompanyFacadeImp instance = new CompanyFacadeImp();
        Company expResult = null;
        Company result = instance.addCompany(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCompany_0args() {
        System.out.println("getCompany");
        CompanyFacadeImp instance = new CompanyFacadeImp();
        List<Company> expResult = null;
        List<Company> result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    public void testGetCompany_int() {
        System.out.println("getCompany");
        int id = 0;
        CompanyFacadeImp instance = new CompanyFacadeImp();
        Company expResult = null;
        Company result = instance.getCompany(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
