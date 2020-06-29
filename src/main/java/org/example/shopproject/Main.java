package org.example.shopproject;

import org.example.shopproject.service.ManagerService;
import org.example.shopproject.service.impl.ManagerServiceImpl;
import org.example.shopproject.service.impl.SellerServiceImpl;

public class Main {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerServiceImpl();
        managerService.newWorkDay(new SellerServiceImpl());
    }
}
