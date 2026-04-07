package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "aircraft")
@Data
public class Aeronave {

    @Id
    @Column(name = "Registration")
    private String registration;

    @Column(name = "OEM_Manufacturer")
    private String oemManufacturer;

    @Column(name = "Aircraft_Model")
    private Integer aircraftModel;

    @Column(name = "Dash")
    private String dash;

    @Column(name = "Customer")
    private Integer customer;

    @Column(name = "Airframe_Cycles") // Corregido según el SQL que ejecutamos
    private Integer airframeCycles;

    @Column(name = "Flight_Cycles")
    private Integer flightCycles;

    @Column(name = "Engine_Cycles")
    private Integer engineCycles;

    @Column(name = "Aircraft_Condition") // Si en tu DB es 'aircraft_condition', cámbialo aquí
    private String condition;

    @Column(name = "Type_Maintenance")
    private String typeMaintenance;
}