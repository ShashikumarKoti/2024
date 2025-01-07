package org.acme.controller;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.config.GreetingConfiguration;
import org.acme.model.Greeting;

import org.jboss.resteasy.reactive.RestResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Path("/hello")
public class GreetingResource {
    @Inject
    GreetingConfiguration greetingConfiguration;


    @Path("/greet")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RestResponse<Greeting> greeting(@Valid Greeting greeting) throws ExecutionException, InterruptedException {
        if (vaidateRequestBody(greeting)) {
            System.out.println("Greeting name:" + greeting.getName());
            return RestResponse.ResponseBuilder.create(RestResponse.Status.OK, greeting).build();
        } else {
            Log.error("Please provide correct request");
            throw new BadRequestException();
        }
    }

    private boolean vaidateRequestBody(Greeting greeting) throws ExecutionException, InterruptedException {
        List<Boolean> booleans = new ArrayList<>();
        AtomicBoolean valid = new AtomicBoolean(true);
        if (!Objects.isNull(greeting)) {
            CompletableFuture.supplyAsync(() -> {
                boolean add = booleans.add(compileRegex(greeting.getDomainClaim(), greetingConfiguration.domainClaim()));
                boolean add1 = booleans.add(compileRegex(greeting.getName(), greetingConfiguration.name()));
                if (!add1)
                    valid.set(false);
                if (!add)
                    valid.set(false);

                return valid.get();
            });
        }
        return valid.get();
    }

    public boolean compileRegex(String request, String regex ) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(request);
        return  matcher.find();

    }


}
