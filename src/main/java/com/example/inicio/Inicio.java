package com.example.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.example.controller", "com.example.services"})
public class Inicio {
    
    public static void main(String[] args){
        SpringApplication.run(Inicio.class, args);
    }

}
