package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.Aeronave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeronaveRepository extends JpaRepository<Aeronave, String> {
    // El String es porque el ID es la matrícula (Registration)
}