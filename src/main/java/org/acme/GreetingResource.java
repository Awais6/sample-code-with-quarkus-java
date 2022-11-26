package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}

@Path("/outofworld")
public class GreetingResource2 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello G 1234";
    }
}
