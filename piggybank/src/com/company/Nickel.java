package com.company;

public class Nickel extends Money {
    double quantity;

    public Nickel() {
        setValue(0.05);
        setName("Nickel");
        setQuantity(1);
    }

    public Nickel(int quantity) {
        setValue(quantity * 0.05);
        setQuantity(quantity);
        setName("Nickel");

    }
}
