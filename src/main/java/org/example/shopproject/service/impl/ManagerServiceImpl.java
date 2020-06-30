package org.example.shopproject.service.impl;

import org.example.shopproject.config.ObjectFactory;
import org.example.shopproject.data.ManageTeacher;
import org.example.shopproject.service.AccountantService;
import org.example.shopproject.service.ManagerService;
import org.example.shopproject.service.WorkEnvironmentService;
import org.example.shopproject.service.impl.AccountantServiceImpl;
import org.example.shopproject.service.impl.SellerServiceImpl;

public class ManagerServiceImpl implements ManagerService {

    private AccountantService accountantService = ObjectFactory.getInstance().createObject(AccountantService.class);
    private ManageTeacher manageTeacher = ObjectFactory.getInstance().createObject(ManageTeacher.class);
    private WorkEnvironmentService workEnvironmentService = ObjectFactory.getInstance().createObject(WorkEnvironmentService.class);

    @Override
    public void newWorkDay(SellerServiceImpl sellerServiceImpl) {

        workEnvironmentService.check();

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
