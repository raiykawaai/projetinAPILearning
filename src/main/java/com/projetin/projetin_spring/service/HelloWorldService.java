package com.projetin.projetin_spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Hello World " + name;
    }

}
