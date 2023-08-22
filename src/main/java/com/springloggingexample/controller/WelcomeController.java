package com.springloggingexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/name/{name}")
    public String view(@PathVariable String name){
        String request = name;
        logger.info("REQUEST : {}",request);
        String response = "WELCOME "+name+" To 3KT";
        logger.info("RESPONSE : {}",response);
        return response;
    }
}
