package org.example.shopproject.service;

import org.example.shopproject.data.ManageTeacher;
import org.example.shopproject.service.impl.AccountantServiceImpl;
import org.example.shopproject.service.impl.SellerServiceImpl;

public class ManagerService {

    AccountantService accountantService = new AccountantServiceImpl();
    ManageTeacher manageTeacher = new ManageTeacher();

    public void newWorkDay(SellerServiceImpl sellerServiceImpl) {

        manage(sellerServiceImpl);

        manageTeacher.teach();

        sellerServiceImpl.improveSales();

        accountantService.isTransferred();
    }

    public void manage(SellerServiceImpl sellerServiceImpl) {
        System.out.println("Проводит собрание!");
        System.out.println("Отвечает на вопросы!");
        System.out.println("Просчитывает зарплату продавца!");
        System.out.println("Составляет ведомость по закупкам товара!");
    }
}
