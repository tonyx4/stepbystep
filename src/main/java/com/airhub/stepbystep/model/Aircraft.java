package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "aircraft")
@Data
public class Aircraft {

    @Id
    @Column(name = "id") // Usaremos el ID numérico de tu phpMyAdmin para evitar errores
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registration")
    private String registration;

    @Column(name = "oem_manufacturer")
    private String oemManufacturer;

    @Column(name = "aircraft_model")
    private Integer aircraftModel;

    @Column(name = "dash")
    private String dash;

    @Column(name = "customer")
    private Integer customer;

    @Column(name = "airframe_cycles")
    private Integer airframeCycles;

    @Column(name = "flight_cycles")
    private Integer flightCycles;

    @Column(name = "engine_cycles")
    private Integer engineCycles;

    @Column(name = "aircraft_condition")
    private String aircraftCondition; // Cambiado de 'condition' a 'aircraftCondition' para que el Service lo encuentre

    @Column(name = "type_maintenance")
    private String typeMaintenance;

    @Column(name = "msn")
    private String msn;
}