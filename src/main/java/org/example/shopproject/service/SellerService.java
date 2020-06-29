package org.example.shopproject.service;

import org.example.shopproject.exception.SellerException;

public class SellerService {
    private boolean teachingQuality = true;

    public void improveSales() {
        if(teachingQuality) {
            System.out.println("Улучшает показатели продаж!");
        } else {
            throw new SellerException("Продажи не улучшились. Обучение не помогло!");
        }
    }
}
