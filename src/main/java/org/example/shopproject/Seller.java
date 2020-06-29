package org.example.shopproject;

public class Seller {
    private boolean teachingQuality = true;

    public void improveSales() {
        if(teachingQuality) {
            System.out.println("Улучшает показатели продаж!");
        } else {
            throw new SellerException("Продажи не улучшились. Обучение не помогло!");
        }
    }
}
