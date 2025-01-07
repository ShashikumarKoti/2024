package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/hello")
public interface TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greet/{name}")
    String getAllPosts(String name);
}
