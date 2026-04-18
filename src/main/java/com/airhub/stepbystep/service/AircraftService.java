package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.Aircraft;
import com.airhub.stepbystep.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftService {

    @Autowired
    private AircraftRepository repository;

    public List<Aircraft> findAll() {
        return repository.findAll();
    }

    public Aircraft save(Aircraft aircraft) {
        return repository.save(aircraft);
    }

    public Aircraft update(Long id, Aircraft updatedAircraft) {
        return repository.findById(id).map(aircraft -> {
            aircraft.setOemManufacturer(updatedAircraft.getOemManufacturer());
            aircraft.setAircraftModel(updatedAircraft.getAircraftModel());
            aircraft.setDash(updatedAircraft.getDash());
            aircraft.setCustomer(updatedAircraft.getCustomer());
            aircraft.setAirframeCycles(updatedAircraft.getAirframeCycles());
            aircraft.setFlightCycles(updatedAircraft.getFlightCycles());
            aircraft.setEngineCycles(updatedAircraft.getEngineCycles());
            aircraft.setAircraftCondition(updatedAircraft.getAircraftCondition());
            aircraft.setTypeMaintenance(updatedAircraft.getTypeMaintenance());
            aircraft.setRegistration(updatedAircraft.getRegistration());
            aircraft.setMsn(updatedAircraft.getMsn());

            return repository.save(aircraft);
        }).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}