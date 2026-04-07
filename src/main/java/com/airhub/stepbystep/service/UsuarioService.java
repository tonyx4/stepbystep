package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.Usuario;
import com.airhub.stepbystep.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio que implementa la lógica de negocio para usuarios.
 */

@Service
public class UsuarioService {

    /**
     * Repositorio utilizado para acceder a la base de datos.
     */

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Guarda un nuevo usuario en la base de datos.
     *
     * @param usuario información del usuario a guardar
     * @return usuario guardado
     */

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    /**
     * Obtiene la lista completa de usuarios registrados.
     *
     * @return lista de usuarios
     */

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    /**
     * Busca un usuario por su identificador.
     *
     * @param id identificador del usuario
     * @return usuario encontrado o vacío si no existe
     */

    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    /**
     * Actualiza la información de un usuario existente.
     *
     * @param id identificador del usuario a actualizar
     * @param usuarioActualizado nuevos datos del usuario
     * @return usuario actualizado o null si no existe
     */

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

    /**
     * Elimina un usuario de la base de datos.
     *
     * @param id identificador del usuario a eliminar
     */

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
