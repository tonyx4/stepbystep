package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.WorkOrder;
import com.airhub.stepbystep.repository.WorkOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkOrderService {

    @Autowired
    private WorkOrderRepository repository;

    // Obtener todas las órdenes (En inglés técnico)
    public List<WorkOrder> findAll() {
        return repository.findAll();
    }

    // Guardar una orden
    public WorkOrder save(WorkOrder workOrder) {
        return repository.save(workOrder);
    }

    // Actualizar orden usando los campos reales de tu tabla (23 columnas)
    public WorkOrder update(Long id, WorkOrder updatedData) {
        return repository.findById(id).map(order -> {
            // Sincronizado con la estructura de tu imagen de phpMyAdmin
            order.setWoNumberInternal(updatedData.getWoNumberInternal()); // Columna 2
            order.setWoNumberExternal(updatedData.getWoNumberExternal()); // Columna 3
            order.setCustomerPo(updatedData.getCustomerPo());             // Columna 4
            order.setAircraftId(updatedData.getAircraftId());             // Columna 5
            order.setComponentId(updatedData.getComponentId());           // Columna 6
            order.setServiceType(updatedData.getServiceType());           // Columna 7
            order.setPriority(updatedData.getPriority());                 // Columna 8
            order.setEntryTtaf(updatedData.getEntryTtaf());               // Columna 9
            order.setEntryCycles(updatedData.getEntryCycles());           // Columna 10
            order.setDateReceivedExternal(updatedData.getDateReceivedExternal()); // Columna 11
            order.setDateEstimatedDelivery(updatedData.getDateEstimatedDelivery()); // Columna 13
            order.setDateClosed(updatedData.getDateClosed());             // Columna 14
            order.setLeadTechnicianId(updatedData.getLeadTechnicianId()); // Columna 15
            order.setInspectorRiiiId(updatedData.getInspectorRiiiId());     // Columna 16
            order.setCustomerRepresentative(updatedData.getCustomerRepresentative()); // Columna 17
            order.setWorkScopeSummary(updatedData.getWorkScopeSummary()); // Columna 18
            order.setManualReference(updatedData.getManualReference());   // Columna 19
            order.setExternalDocUrl(updatedData.getExternalDocUrl());     // Columna 20
            order.setStatus(updatedData.getStatus());                     // Columna 21

            return repository.save(order);
        }).orElse(null);
    }

    // Eliminar orden
    public void delete(Long id) {
        repository.deleteById(id);
    }
}