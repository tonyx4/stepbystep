package com.airhub.stepbystep.service;

import com.airhub.stepbystep.model.Component;
import com.airhub.stepbystep.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComponentService {

    @Autowired
    private ComponentRepository repository;

    public List<Component> findAll() {
        return repository.findAll();
    }

    public Component save(Component component) {
        return repository.save(component);
    }
}