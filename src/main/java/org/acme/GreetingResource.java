package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {
    
    @GET
    @Path("/hi")
    public String hi() {
        return "Hi from my side";
    }
    
    @GET
    @Path("/last")
    public String last() {
        
        return "picking file";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}
