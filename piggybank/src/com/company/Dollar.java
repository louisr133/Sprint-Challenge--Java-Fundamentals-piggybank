package com.company;

public class Dollar extends Money {
    int quantity;

    public Dollar() {
        setValue(1.00);
        setName("Dollar");
        setQuantity(1);
    }

    public Dollar(int quantity) {
        setValue(quantity*1.00);
        setQuantity(quantity);
        setName("Dollar");
    }
}
