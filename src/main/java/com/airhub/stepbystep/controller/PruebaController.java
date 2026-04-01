package com.airhub.stepbystep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public String prueba() {
        return "FUNCIONA";
    }
}