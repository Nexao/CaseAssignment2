package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Person;
import facade.IPersonFacade;
import facade.PersonFacadeImp;
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
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Diana
 */
@Path("person")
public class PersonService {

    static IPersonFacade facade = new PersonFacadeImp(Persistence.createEntityManagerFactory("pu"));
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    public PersonService() {
    }

    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersons() {
        List<Person> persons = facade.getPersons();
        return gson.toJson(persons);
    }

    @GET
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("id") int id) {
        Person p = facade.getPerson(id);
        return gson.toJson(p);
    }
    @GET
    @Path("contactinfo")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllContactInfo() {
        List<Person> persons = facade.getPersons();
        return gson.toJson(persons);
    }

    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addPerson(String personJsonStr) throws Exception{
        Person p = gson.fromJson(personJsonStr, Person.class);
        Person newPerson = facade.addPerson(p);
        String jsonResult = gson.toJson(newPerson);
        return jsonResult;
    }

    @PUT
    @Path("edit")
    @Consumes(MediaType.APPLICATION_JSON)
    public void editPerson(String content) {

    }
}
