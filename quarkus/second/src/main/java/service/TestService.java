package service;

import controller.TestResource;
import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.net.URI;

@Path("rest-client")
public class TestService {

    TestResource testResource;

    public TestService() {
        testResource = QuarkusRestClientBuilder.newBuilder()
                .baseUri(URI.create("http://localhost:8080"))
                .build(TestResource.class);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test/{name}")
    public String getPosts(String name) {
        return testResource.getAllPosts(name);
    }

}
