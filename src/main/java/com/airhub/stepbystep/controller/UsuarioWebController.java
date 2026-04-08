package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Usuario;
import com.airhub.stepbystep.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuarios")
public class UsuarioWebController {

    @Autowired
    private UsuarioService usuarioService;

    // Este método es para MOSTRAR el formulario (GET)
    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "usuarios";
    }

    // Este método es para RECIBIR los datos del formulario (POST)
    @PostMapping("/guardar")
    public String guardarUsuario(@RequestParam String nombre,
                                 @RequestParam String correo,
                                 @RequestParam String cargo,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 Model model) {

        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setCargo(cargo);
        usuario.setUsername(username);
        usuario.setPassword(password);

        usuarioService.guardarUsuario(usuario);

        model.addAttribute("mensaje", "Usuario registrado correctamente en la base de datos");

        return "usuarios";
    }
}