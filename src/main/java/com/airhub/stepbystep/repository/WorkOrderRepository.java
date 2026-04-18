package com.airhub.stepbystep.repository;

import com.airhub.stepbystep.model.WorkOrder;
import com.airhub.stepbystep.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {
}