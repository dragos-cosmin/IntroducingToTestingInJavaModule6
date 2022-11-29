package com.monotonic.testing.m6;

public class Sale {

    private String store;
    private int number;
    private int pricePerItem;

    public Sale(String store, int number, int pricePerItem) {

        this.store = store;
        this.number = number;
        this.pricePerItem = pricePerItem;
    }

    public int getNumber() {
        return number;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public String getStore() {
        return store;
    }

    public int getValue() {
        return number * pricePerItem;
    }


}
