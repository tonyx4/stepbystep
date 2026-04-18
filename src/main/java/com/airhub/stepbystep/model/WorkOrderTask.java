package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "work_order_tasks")
public class WorkOrderTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "work_order_id")
    private Long workOrderId;

    @Column(name = "task_type")
    private String taskType;

    @Column(name = "ata_chapter")
    private Integer ataChapter;

    @Column(name = "manual_reference")
    private String manualReference;

    private String description;

    @Column(name = "task_status")
    private String taskStatus;

    @Column(name = "is_rii")
    private Integer isRii;

    @Column(name = "technician_id")
    private Long technicianId;

    @Column(name = "inspector_id")
    private Long inspectorId;

    @Column(name = "man_hours_estimated")
    private BigDecimal manHoursEstimated;

    @Column(name = "man_hours_actual")
    private BigDecimal manHoursActual;

    // GETTERS Y SETTERS

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getWorkOrderId() { return workOrderId; }
    public void setWorkOrderId(Long workOrderId) { this.workOrderId = workOrderId; }

    public String getTaskType() { return taskType; }
    public void setTaskType(String taskType) { this.taskType = taskType; }

    public Integer getAtaChapter() { return ataChapter; }
    public void setAtaChapter(Integer ataChapter) { this.ataChapter = ataChapter; }

    public String getManualReference() { return manualReference; }
    public void setManualReference(String manualReference) { this.manualReference = manualReference; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTaskStatus() { return taskStatus; }
    public void setTaskStatus(String taskStatus) { this.taskStatus = taskStatus; }

    public Integer getIsRii() { return isRii; }
    public void setIsRii(Integer isRii) { this.isRii = isRii; }

    public Long getTechnicianId() { return technicianId; }
    public void setTechnicianId(Long technicianId) { this.technicianId = technicianId; }

    public Long getInspectorId() { return inspectorId; }
    public void setInspectorId(Long inspectorId) { this.inspectorId = inspectorId; }

    public BigDecimal getManHoursEstimated() { return manHoursEstimated; }
    public void setManHoursEstimated(BigDecimal manHoursEstimated) { this.manHoursEstimated = manHoursEstimated; }

    public BigDecimal getManHoursActual() { return manHoursActual; }
    public void setManHoursActual(BigDecimal manHoursActual) { this.manHoursActual = manHoursActual; }
}