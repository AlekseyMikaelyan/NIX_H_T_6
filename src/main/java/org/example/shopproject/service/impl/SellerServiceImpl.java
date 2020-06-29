package org.example.shopproject.service.impl;

import org.example.shopproject.exception.SellerException;
import org.example.shopproject.service.SellerService;

public class SellerServiceImpl implements SellerService {
    private boolean teachingQuality = true;

    @Override
    public void improveSales() {
        if(teachingQuality) {
            System.out.println("Улучшает показатели продаж!");
        } else {
            throw new SellerException("Продажи не улучшились. Обучение не помогло!");
        }
    }
}
