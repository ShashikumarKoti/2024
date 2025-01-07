//package org.acme.util;
//
//import io.quarkus.runtime.ApplicationConfig;
//import io.quarkus.runtime.Startup;
//import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.enterprise.inject.Instance;
//import jakarta.inject.Inject;
//import org.acme.model.Greeting;
//import org.acme.service.GreetingService;
//
//@ApplicationScoped
//@Startup
//public class Context  {
//
//    private Greeting greeting;
//    @Inject
//    private Instance<Greeting> greetingServiceInstance;
//
//    public void doSomething() {
//        System.out.println("doSomething() called");
//        Greeting greeting1 = greetingServiceInstance.get();
//        greeting1.display();
//    }
//}
