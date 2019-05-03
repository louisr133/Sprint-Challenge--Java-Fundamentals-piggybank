package com.company;

public class Penny extends Money {
    int quantity;

    public Penny() {
        setValue(0.01);
        setName("Penny");
        setQuantity(1);
    }

    public Penny(int quantity) {
        setValue(quantity*0.01);
        setQuantity(quantity);
        setName("Penny");
    }

}
