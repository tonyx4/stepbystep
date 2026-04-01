package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.Usuario;
import com.airhub.stepbystep.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Insertar un usuario
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Consultar todos los usuarios
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    // Consultar un usuario por ID
    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // Actualizar un usuario
    public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado) {

        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente.isPresent()) {

            Usuario usuario = usuarioExistente.get();

            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setCorreo(usuarioActualizado.getCorreo());
            usuario.setCargo(usuarioActualizado.getCargo());

            return usuarioRepository.save(usuario);
        }

        return null;
    }

    // Eliminar un usuario
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}