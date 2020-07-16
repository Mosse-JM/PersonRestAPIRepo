package com.modistest.PersonREST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Controller.PersonController;
import Services.PersonService;

@Configuration 
public class SpringConfig { 

@Bean
public PersonService personService() {
    return new PersonService();
}

@Bean
public PersonController personController() {
    return new PersonController();
}

}
