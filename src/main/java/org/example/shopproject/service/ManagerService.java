package org.example.shopproject.service;

import org.example.shopproject.data.ManageTeacher;
import org.example.shopproject.service.impl.AccountantServiceImpl;

public class ManagerService {

    AccountantService accountantService = new AccountantServiceImpl();
    ManageTeacher manageTeacher = new ManageTeacher();

    public void newWorkDay(SellerService sellerService) {

        manage(sellerService);

        manageTeacher.teach();

        sellerService.improveSales();

        accountantService.isTransferred();
    }

    public void manage(SellerService sellerService) {
        System.out.println("Проводит собрание!");
        System.out.println("Отвечает на вопросы!");
        System.out.println("Просчитывает зарплату продавца!");
        System.out.println("Составляет ведомость по закупкам товара!");
    }
}
