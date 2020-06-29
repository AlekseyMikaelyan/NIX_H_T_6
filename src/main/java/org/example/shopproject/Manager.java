package org.example.shopproject;

public class Manager {

    Accountant accountant = new Accountant();
    ManageTeacher manageTeacher = new ManageTeacher();

    public void newWorkDay(Seller seller) {

        manage(seller);

        System.out.println("Улучшает показатели продаж!");

        manageTeacher.teach();

        accountant.isTransferred();
    }

    public void manage(Seller seller) {
        System.out.println("Проводит собрание!");
        System.out.println("Отвечает на вопросы!");
        System.out.println("Просчитывает зарплату продавца!");
        System.out.println("Составляет ведомость по закупкам товара!");
    }
}
