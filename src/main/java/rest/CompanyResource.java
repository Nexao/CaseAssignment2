package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Company;
import entity.Person;
import facade.CompanyFacadeImp;
import facade.ICompanyFacade;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import static rest.PersonService.facade;

/**
 * REST Web Service
 *
 * @author Diana
 */
@Path("company")
public class CompanyResource {

    static ICompanyFacade cfacade = new CompanyFacadeImp(Persistence.createEntityManagerFactory("pu"));
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    public CompanyResource() {
    }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getCompanys() throws Exception {
    List<Company> company = cfacade.getCompany();
    return gson.toJson(company);
  }
    
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String addCompany(String companyJsonStr) throws Exception {
    Company c = gson.fromJson(companyJsonStr, Company.class);
    Company newC = cfacade.addCompany(c);
    String jsonResult = gson.toJson(newC);
    return jsonResult;
  }

    
}
