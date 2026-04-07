package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado de las operaciones de acceso a datos
 * para la entidad Usuario.
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}