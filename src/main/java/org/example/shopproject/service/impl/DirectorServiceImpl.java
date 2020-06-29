package org.example.shopproject.service.impl;

import org.example.shopproject.exception.AccountantException;
import org.example.shopproject.service.AccountantService;

public class DirectorServiceImpl implements AccountantService {
    private boolean salaryTransfer = true;
    private boolean improveSalary = true;

    @Override
    public void isTransferred() {
        if(salaryTransfer) {
            System.out.println("Начисляет зарплату!");
        } else {
            throw new AccountantException("Зарплата не начислена!");
        }
        if(improveSalary) {
            System.out.println("Увеличиваю зарплату!");
        } else {
            throw new AccountantException("Зарплата остается такой же!");
        }
    }
}
