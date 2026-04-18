package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Component.
 * Permite realizar operaciones CRUD sobre la tabla 'components'.
 */
@Repository
public interface ComponentRepository extends JpaRepository<Component, Long> {
    // Hereda métodos para buscar por ID (Long), guardar, listar, etc.
}