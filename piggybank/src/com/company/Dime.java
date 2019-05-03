package com.company;

public class Dime extends Money {

    public Dime() {
        setValue(0.1);
        setName("Dime");
        setQuantity(1);
    }

    public Dime(int quantity) {
        setValue(quantity*0.1);
        setQuantity(quantity);
        setName("Dime");
    }

}
