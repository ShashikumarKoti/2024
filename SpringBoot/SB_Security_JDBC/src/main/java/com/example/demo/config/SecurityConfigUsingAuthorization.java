package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@EnableWebSecurity
public class SecurityConfigUsingAuthorization extends WebSecurityConfigurerAdapter {

    //by default this datasource is pointing to h2 database.
    @Autowired
    private DataSource dataSource;

    //Approach-1: to use default schema
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        //set your configuration on the auth object
//        //When we are using embedded database, spring-boot autoconfigures the datasource
//        auth.jdbcAuthentication()
//                .dataSource(dataSource);
//    }

    //Approach-2: to use different schema instead of default schema
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //set your configuration on the auth object
        //When we are using embedded database, spring-boot autoconfigures the datasource
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username,password,enabled from my_users where username=?")
                .authoritiesByUsernameQuery("select username,authority from my_authorities where username=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
            http.authorizeRequests()
                    .antMatchers("/admin").hasRole("ADMIN")
                    .antMatchers("/user").hasAnyRole("USER", "ADMIN")
                    .antMatchers("/").permitAll()
                    .and()
                    .formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
