package org.example.shopproject.service.impl;

import org.example.shopproject.annotation.Value;
import org.example.shopproject.service.WorkEnvironmentService;

public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value
    private String lectureHall;

    @Override
    public void check() {
        System.out.println("Аудитория " + lectureHall + " готова к проведению собрания.");
    }
}
