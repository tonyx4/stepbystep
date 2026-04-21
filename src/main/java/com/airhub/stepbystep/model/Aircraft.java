package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "aircraft")
@Data
public class Aircraft {

    @Id
    @Column(name = "id") // ID autonumérico según phpMyAdmin
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registration")
    private String registration;

    @Column(name = "msn")
    private String msn;

    // --- CAMPOS ADICIONALES PARA EVITAR ERROR 500 ---
    // Mapeo exacto con las columnas de la base de datos

    @Column(name = "model_series")
    private String modelSeries;

    @Column(name = "operator_owner")
    private String operatorOwner;

    @Column(name = "total_time_airframe")
    private Double totalTimeAirframe;

    @Column(name = "total_cycles")
    private Integer totalCycles;

    @Column(name = "date_entry")
    private LocalDateTime dateEntry;

    // --- CAMPOS DE ESTRUCTURA ORIGINAL ---

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
    private String aircraftCondition;

    @Column(name = "type_maintenance")
    private String typeMaintenance;
}