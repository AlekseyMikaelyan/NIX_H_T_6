package org.example.shopproject.service;

import org.example.shopproject.exception.AccountantException;

public class AccountantService {
    private boolean salaryTransfer = true;

    public void isTransferred() {
        if(salaryTransfer) {
            System.out.println("Начисляет зарплату!");
        } else {
            throw new AccountantException("Зарплата не начислена!");
        }
    }
}
