/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorHandling;

import javax.ws.rs.ext.Provider;

/**
 *
 * @author jarmo
 */
@Provider
public class PersonNotFoundException extends ErrorMessage {
    public PersonNotFoundException() {
    super("No such person found!", 404);
    }
    
    
}
