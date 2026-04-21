package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.User;
import com.airhub.stepbystep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller; // Se cambia a @Controller para manejar vistas JSP
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Controlador encargado de gestionar las operaciones CRUD de usuarios,
 * soportando tanto peticiones REST como navegación web.
 */
@Controller // Cambiado para permitir redirecciones a vistas JSP
@RequestMapping("/users")
public class UserController {

    /**
     * Servicio que contiene la lógica de negocio de usuarios.
     */
    @Autowired
    private UserService userService;

    /**
     * Obtiene la lista completa de usuarios registrados.
     *
     * @return lista de usuarios en formato JSON (se añade @ResponseBody)
     */
    @GetMapping("/api")
    @ResponseBody
    public List<User> obtenerUsuarios() {
        return userService.getAllUsers();
    }

    /**
     * Guarda un nuevo usuario en la base de datos (Postman - JSON).
     *
     * @param usuario datos del usuario enviados desde Postman
     * @return usuario guardado
     */
    @PostMapping("/api")
    @ResponseBody
    public User guardarUsuario(@RequestBody User usuario) {
        return userService.saveUser(usuario);
    }

    /**
     * Guarda un usuario desde formulario web (JSP).
     * * @param user objeto usuario mapeado desde el formulario
     * @return redirección a la lista de usuarios web
     */
    @PostMapping("/guardar")
    public String saveUserFromForm(@ModelAttribute("user") User user) {
        // Al recibir el objeto 'user', Spring ya trae licencia, especialidad, etc.
        userService.saveUser(user);
        return "redirect:/usuarios-web";
    }

    /**
     * Actualiza la información de un usuario existente.
     *
     * @param id identificador del usuario
     * @param usuario nuevos datos del usuario
     * @return usuario actualizado
     */
    @PutMapping("/api/{id}")
    @ResponseBody
    public User actualizarUsuario(@PathVariable Long id, @RequestBody User usuario) {
        return userService.updateUser(id, usuario);
    }

    /**
     * Elimina un usuario de la base de datos según su identificador.
     *
     * @param id identificador del usuario a eliminar
     * @return redirección o estado
     */
    @DeleteMapping("/api/{id}")
    @ResponseBody
    public void eliminarUsuario(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}