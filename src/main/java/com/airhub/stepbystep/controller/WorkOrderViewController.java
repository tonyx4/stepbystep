package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.WorkOrder;
import com.airhub.stepbystep.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/workorders-form")
public class WorkOrderViewController {

    @Autowired
    private WorkOrderService service;

    // Mostrar formulario JSP
    @GetMapping
    public String mostrarFormulario() {
        return "workorder";
    }

    // Guardar datos desde formulario JSP
    @PostMapping("/guardar")
    public String guardarDesdeFormulario(WorkOrder workOrder) {
        service.save(workOrder);
        return "redirect:/workorders-form";
    }
}