package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.Aeronave;
import com.airhub.stepbystep.repository.AeronaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AeronaveServices {

    @Autowired
    private AeronaveRepository repository;

    public List<Aeronave> obtenerTodos() {
        return repository.findAll();
    }

    public Aeronave guardar(Aeronave aeronave) {
        return repository.save(aeronave);
    }

    public Aeronave actualizar(String id, Aeronave nuevaAeronave) {
        return repository.findById(id).map(aeronave -> {
            // Usamos los nombres exactos que definimos en Aeronave.java
            aeronave.setOemManufacturer(nuevaAeronave.getOemManufacturer());
            aeronave.setAircraftModel(nuevaAeronave.getAircraftModel());
            aeronave.setDash(nuevaAeronave.getDash());
            aeronave.setCustomer(nuevaAeronave.getCustomer());
            aeronave.setAirframeCycles(nuevaAeronave.getAirframeCycles());
            aeronave.setFlightCycles(nuevaAeronave.getFlightCycles());
            aeronave.setEngineCycles(nuevaAeronave.getEngineCycles());
            aeronave.setCondition(nuevaAeronave.getCondition());
            aeronave.setTypeMaintenance(nuevaAeronave.getTypeMaintenance());

            return repository.save(aeronave);
        }).orElse(null);
    }

    public void eliminar(String id) {
        repository.deleteById(id);
    }
}