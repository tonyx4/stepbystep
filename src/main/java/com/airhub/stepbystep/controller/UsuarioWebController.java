package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.User;
import com.airhub.stepbystep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Web controller to display users in JSP view.
 */
@Controller
public class UsuarioWebController {

    /**
     * Servicio que contiene la lógica de negocio de usuarios.
     */
    @Autowired
    private UserService userService;

    /**
     * Muestra la lista completa de usuarios registrados en la vista usuarios.jsp.
     *
     * @param model objeto para pasar datos a la vista
     * @return nombre del archivo JSP
     */
    @GetMapping("/usuarios-web")
    public String showUsers(Model model) {

        List<User> users = userService.getAllUsers();

        model.addAttribute("usuarios", users);

        return "usuarios";
    }

    /**
     * Prepara el modelo para mostrar el formulario de registro de usuario.
     * Este método mapea el objeto User para que el JSP pueda recibir los datos.
     * * @param model objeto para pasar el nuevo usuario a la vista
     * @return nombre del archivo JSP (usuarios.jsp)
     */
    @GetMapping("/usuarios-web/nuevo")
    public String showNewUserForm(Model model) {

        // Creamos una instancia vacía de User para el formulario
        User user = new User();

        // Pasamos el objeto al modelo con el nombre "user"
        model.addAttribute("user", user);

        // Retornamos "usuarios" porque tu archivo se llama usuarios.jsp
        return "usuarios";
    }
}