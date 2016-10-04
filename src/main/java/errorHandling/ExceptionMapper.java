/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorHandling;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletContext;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Diana
 */
@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Exception>{

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context 
    ServletContext context;
    
    @Override
    public Response toResponse(Exception ex) {
        int statusCode = 500;
      String msg = ex.getMessage();
       if(ex instanceof WebApplicationException){
        
         Response res = ((WebApplicationException) ex).getResponse();
         if(res != null){
           Response.StatusType type = res.getStatusInfo();
           statusCode = type.getStatusCode();
           msg = type.getReasonPhrase();
         }         
       }
       ErrorMessage err = new ErrorMessage(msg,statusCode);
       return Response.status(statusCode)
				.entity(gson.toJson(err))
				.type(MediaType.APPLICATION_JSON).
				build();
	}
    
}
