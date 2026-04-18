package com.airhub.stepbystep.controller;

import com.airhub.stepbystep.model
        .WorkOrderTask;
import com.airhub.stepbystep.repository.WorkOrderTaskRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/work-order-tasks")
public class WorkOrderTaskController {

    private final WorkOrderTaskRepository repository;

    public WorkOrderTaskController(WorkOrderTaskRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public WorkOrderTask create(@RequestBody WorkOrderTask task) {
        return repository.save(task);
    }
}
