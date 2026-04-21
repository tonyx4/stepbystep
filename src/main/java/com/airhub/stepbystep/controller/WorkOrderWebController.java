package com.airhub.stepbystep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkOrderWebController {

    @GetMapping("/workorders")
    public String mostrarFormulario() {
        return "workorder"; // llama a workorder.jsp
    }
}