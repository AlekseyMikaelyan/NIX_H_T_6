package org.example.shopproject;

public class Accountant {
    private boolean salaryTransfer = true;

    public void isTransferred() {
        if(salaryTransfer) {
            System.out.println("Начисляет зарплату!");
        } else {
            throw new AccountantException("Зарплата не начислена!");
        }
    }
}
