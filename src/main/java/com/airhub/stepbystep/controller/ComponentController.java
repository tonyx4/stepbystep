package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Component;
import com.airhub.stepbystep.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/components")
public class ComponentController {

    @Autowired
    private ComponentService service;

    @GetMapping
    public List<Component> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Component create(@RequestBody Component component) {
        return service.save(component);
    }
}