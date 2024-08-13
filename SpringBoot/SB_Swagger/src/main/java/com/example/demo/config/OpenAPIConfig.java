package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.text.html.HTML;
import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI apiInfo() {
        Server server1 = new Server();
        server1.setUrl("http://localhost:8080");
        server1.setDescription("Development");

        Server server2 = new Server();
        server2.setUrl("http://localhost:9090");
        server2.setDescription("Staging");

        Contact myContact = new Contact();
        myContact.setName("Shashikumar");
        myContact.setEmail("sk@gmail.com");

        Info info = new Info()
                .title("Employee Management System API")
                .version("1.0")
                .description("This API exposes endpoints to manage employees.")
                .contact(myContact);
        return new OpenAPI().info(info).servers(List.of(server1, server2));
    }

//    @Bean
//    public OpenAPI customOpenAPI() {
//        Server server1 = new Server();
//        server1.setUrl("http://localhost:8080");
//        server1.setDescription("Development");
//
//        Server server2 = new Server();
//        server2.setUrl("http://localhost:9090");
//        server2.setDescription("Staging");
//        return  new OpenAPI().info(new Info().title("Test").description("Dummy desc"))
//                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
//                .servers(List.of(server1, server2));
//    }
}
