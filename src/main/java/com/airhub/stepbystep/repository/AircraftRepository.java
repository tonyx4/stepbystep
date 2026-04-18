package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
    // El String es porque el ID es la matrícula (Registration)
}