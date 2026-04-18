package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.User;
import com.airhub.stepbystep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio que implementa la lógica de negocio para usuarios.
 */

@Service
public class UserService {

    /**
     * Repositorio utilizado para acceder a la base de datos.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Guarda un nuevo usuario en la base de datos.
     *
     * @param user información del usuario a guardar
     * @return usuario guardado
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Obtiene la lista completa de usuarios registrados.
     *
     * @return lista de usuarios
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Busca un usuario por su identificador.
     *
     * @param id identificador del usuario
     * @return usuario encontrado o vacío si no existe
     */
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Actualiza la información de un usuario existente.
     *
     * @param id identificador del usuario a actualizar
     * @param updatedUser nuevos datos del usuario
     * @return usuario actualizado o null si no existe
     */
    public User updateUser(Long id, User updatedUser) {

        Optional<User> existingUser = userRepository.findById(id);

        if (existingUser.isPresent()) {

            User user = existingUser.get();

            user.setFullName(updatedUser.getFullName());
            user.setEmail(updatedUser.getEmail());
            user.setRole(updatedUser.getRole());
            user.setUsername(updatedUser.getUsername());
            user.setPassword(updatedUser.getPassword());

            return userRepository.save(user);
        }

        return null;
    }

    /**
     * Elimina un usuario de la base de datos.
     *
     * @param id identificador del usuario a eliminar
     */
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}