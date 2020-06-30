package org.example.shopproject.service.impl;

import org.example.shopproject.annotation.Value;
import org.example.shopproject.service.WorkEnvironmentService;

public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value("214")
    private String lectureHall;

    @Override
    public void check() {
        System.out.println("Аудитория " + lectureHall + " готова к проведению собрания.");
    }
}
