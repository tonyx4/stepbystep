package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Aircraft;
import com.airhub.stepbystep.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft") // URL técnica aeronáutica
public class AircraftController {

    @Autowired
    private AircraftService service;

    // Obtener todas las aeronaves
    @GetMapping
    public List<Aircraft> findAll() {
        return service.findAll();
    }

    // Guardar una nueva aeronave
    @PostMapping
    public Aircraft save(@RequestBody Aircraft aircraft) {
        return service.save(aircraft);
    }

    // Actualizar aeronave (Usando Long para el ID)
    @PutMapping("/{id}")
    public Aircraft update(@PathVariable Long id, @RequestBody Aircraft aircraft) {
        return service.update(id, aircraft);
    }

    // Eliminar aeronave (Usando Long para el ID)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}