package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.User;
import com.airhub.stepbystep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST encargado de gestionar las operaciones CRUD de usuarios.
 */

@RestController
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
     * @return lista de usuarios
     */
    @GetMapping
    public List<User> obtenerUsuarios() {
        return userService.getAllUsers();
    }

    /**
     * Guarda un nuevo usuario en la base de datos (Postman - JSON).
     *
     * @param usuario datos del usuario enviados desde Postman
     * @return usuario guardado
     */
    @PostMapping
    public User guardarUsuario(@RequestBody User usuario) {
        return userService.saveUser(usuario);
    }

    /**
     * Guarda un usuario desde formulario web (JSP).
     */
    @PostMapping("/guardar")
    public String saveUserFromForm(User user) {
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
    @PutMapping("/{id}")
    public User actualizarUsuario(@PathVariable Long id, @RequestBody User usuario) {
        return userService.updateUser(id, usuario);
    }

    /**
     * Elimina un usuario de la base de datos según su identificador.
     *
     * @param id identificador del usuario a eliminar
     */
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}