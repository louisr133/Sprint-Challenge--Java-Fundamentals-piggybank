package com.company;

public class Quarter extends Money{
    int quantity;

    public Quarter() {
        setValue(0.25);
        setName("Quarter");
        setQuantity(1);
    }

    public Quarter(int quantity) {
        setValue(quantity*0.25);
        setQuantity(quantity);
        setName("Quarter");
    }
}
