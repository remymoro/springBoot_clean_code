package com.java.playground.solid.lsp;

public class CollectorBookDelivery extends OfflineDelivery{


    @Override
    public void getDeliveryLocation() {
        System.out.println("Delivery location is the nearest collector point");
    }
}
