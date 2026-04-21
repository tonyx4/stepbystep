package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Aircraft;
import com.airhub.stepbystep.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller // <--- NOTA: Es @Controller a secas, NO @RestController. Esto permite usar JSPs.
public class AircraftViewController {

    @Autowired
    private AircraftService aircraftService;

    // Este método solo sirve para abrir la página del formulario
    @GetMapping("/aircraft-web")
    public String abrirFormulario() {
        return "aircraft_registro"; // Esto busca el archivo aircraft_registro.jsp
    }

    // Este método recibe los datos del formulario y los guarda
    @PostMapping("/web/aircraft/guardar")
    public String guardarDesdeWeb(@ModelAttribute Aircraft aircraft) {
        aircraftService.save(aircraft);
        // Al terminar, te devuelve al formulario con un aviso de éxito
        return "redirect:/aircraft-web?exito=true";
    }
}