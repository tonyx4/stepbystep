package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.OrdenTrabajo;
import com.airhub.stepbystep.service.OrdenTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenTrabajoController {

    @Autowired
    private OrdenTrabajoService service;

    @GetMapping
    public List<OrdenTrabajo> obtenerTodas() {
        return service.obtenerTodos();
    }

    @PostMapping
    public OrdenTrabajo guardar(@RequestBody OrdenTrabajo ordenTrabajo) {
        return service.guardar(ordenTrabajo);
    }

    @PutMapping("/{id}")
    public OrdenTrabajo actualizar(@PathVariable Long id,
                                   @RequestBody OrdenTrabajo ordenTrabajo) {
        return service.actualizar(id, ordenTrabajo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}