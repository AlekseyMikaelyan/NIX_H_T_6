package org.example.shopproject.service.impl;

import org.example.shopproject.exception.AccountantException;
import org.example.shopproject.service.AccountantService;

public class AccountantServiceImpl implements AccountantService {
    private boolean salaryTransfer = true;

    @Override
    public void isTransferred() {
        if(salaryTransfer) {
            System.out.println("Начисляет зарплату!");
        } else {
            throw new AccountantException("Зарплата не начислена!");
        }
    }
}
