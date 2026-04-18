package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_order")
@Data
@NoArgsConstructor
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wo_number_internal", nullable = false)
    private String woNumberInternal;

    @Column(name = "wo_number_external", nullable = false)
    private String woNumberExternal;

    @Column(name = "customer_po")
    private String customerPo;

    @Column(name = "aircraft_id", nullable = false)
    private Long aircraftId;

    @Column(name = "component_id")
    private Long componentId;

    @Column(name = "service_type", nullable = false)
    private String serviceType; // Enum: Line, Base, Shop, etc.

    @Column(name = "priority")
    private String priority; // Enum: Routine, Urgent, AOG

    @Column(name = "entry_ttaf")
    private BigDecimal entryTtaf;

    @Column(name = "entry_cycles")
    private Integer entryCycles;

    @Column(name = "date_received_external")
    private LocalDate dateReceivedExternal;

    @Column(name = "date_opened_internal", insertable = false, updatable = false)
    private LocalDateTime dateOpenedInternal;

    @Column(name = "date_estimated_delivery")
    private LocalDateTime dateEstimatedDelivery;

    @Column(name = "date_closed")
    private LocalDateTime dateClosed;

    @Column(name = "lead_technician_id", nullable = false)
    private Long leadTechnicianId;

    @Column(name = "inspector_riii_id")
    private Long inspectorRiiiId;

    @Column(name = "customer_representative")
    private String customerRepresentative;

    @Column(name = "work_scope_summary", columnDefinition = "TEXT")
    private String workScopeSummary;

    @Column(name = "manual_reference")
    private String manualReference;

    @Column(name = "external_doc_url")
    private String externalDocUrl;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;
}