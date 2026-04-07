package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model.Usuario;
import com.airhub.stepbystep.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    /**
    * Controlador REST encargado de gestionar las operaciones CRUD de usuarios.
    */

    @RestController
    @RequestMapping("/usuarios")
    public class UsuarioController {

    /**
    /*** Servicio que contiene la lógica de negocio de usuarios.
     */

    @Autowired
    private UsuarioService usuarioService;

    /***
     * Obtiene la lista completa de usuarios registrados.
     *
     * @return lista de usuarios
     */

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    /**
     * Guarda un nuevo usuario en la base de datos.
     *
     * @param usuario datos del usuario enviados desde Postman
     * @return usuario guardado
     */

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    /**
     * Actualiza la información de un usuario existente.
     *
     * @param id identificador del usuario
     * @param usuario nuevos datos del usuario
     * @return usuario actualizado
     */

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.actualizarUsuario(id, usuario);
    }

    /**
     * Elimina un usuario de la base de datos según su identificador.
     *
     * @param id identificador del usuario a eliminar
     */

     @DeleteMapping("/{id}")
     public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
     }
