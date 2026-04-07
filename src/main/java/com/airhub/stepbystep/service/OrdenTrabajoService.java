package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.OrdenTrabajo;
import com.airhub.stepbystep.repository.OrdenTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenTrabajoService {

    @Autowired
    private OrdenTrabajoRepository repository;

    public List<OrdenTrabajo> obtenerTodos() {
        return repository.findAll();
    }

    public OrdenTrabajo guardar(OrdenTrabajo ordenTrabajo) {
        return repository.save(ordenTrabajo);
    }

    public OrdenTrabajo actualizar(Long id, OrdenTrabajo nuevaOrden) {
        OrdenTrabajo orden = repository.findById(id).orElse(null);

        if (orden != null) {
            orden.setNumeroOrden(nuevaOrden.getNumeroOrden());
            orden.setAeronave(nuevaOrden.getAeronave());
            orden.setComponente(nuevaOrden.getComponente());
            orden.setEstado(nuevaOrden.getEstado());
            orden.setTecnicoAsignado(nuevaOrden.getTecnicoAsignado());
            orden.setFechaIngreso(nuevaOrden.getFechaIngreso());

            return repository.save(orden);
        }

        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}