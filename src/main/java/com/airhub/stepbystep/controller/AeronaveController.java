package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Aeronave;
import com.airhub.stepbystep.service.AeronaveServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeronaves") // Esta será la URL en Postman
public class AeronaveController {

    @Autowired
    private AeronaveServices service;

    @GetMapping
    public List<Aeronave> obtenerTodas() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Aeronave guardar(@RequestBody Aeronave aeronave) {
        return service.guardar(aeronave);
    }

    @PutMapping("/{id}")
    public Aeronave actualizar(@PathVariable String id, @RequestBody Aeronave aeronave) {
        return service.actualizar(id, aeronave);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}