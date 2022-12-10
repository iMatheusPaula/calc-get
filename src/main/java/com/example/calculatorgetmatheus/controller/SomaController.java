package com.example.calculatorgetmatheus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/calculator")
public class SomaController {
     
    @GetMapping(value = "/{num1}/{num2}")
    public Integer Soma(@PathVariable Integer n1, @PathVariable Integer n2){
        return n1 + n2;
    }
}
