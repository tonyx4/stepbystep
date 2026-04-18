package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.WorkOrder;
import com.airhub.stepbystep.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/work-orders")
public class WorkOrderController {

    @Autowired
    private WorkOrderService service;

    // Obtener todas las órdenes
    @GetMapping
    public List<WorkOrder> getAll() {
        return service.findAll();
    }

    // Guardar una nueva orden
    @PostMapping
    public WorkOrder create(@RequestBody WorkOrder workOrder) {
        return service.save(workOrder);
    }

    // Actualizar orden existente
    @PutMapping("/{id}")
    public WorkOrder update(@PathVariable Long id, @RequestBody WorkOrder workOrder) {
        return service.update(id, workOrder);
    }

    // Eliminar orden
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}