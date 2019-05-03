package com.company;

public abstract class Money {
    private double value;
    private String name;
    private int quantity;

    public void setValue(double value ){
        this.value = value;
    };

    public double getValue(){
        return this.value;
    };

    public void setName(String name ){
        this.name = name;
    };

    public String getName(){
        return this.name;
    };

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    };

    public int getQuantity() {
        return this.quantity;
    }
}
