package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.WorkOrderTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderTaskRepository extends JpaRepository<WorkOrderTask, Long> {
}