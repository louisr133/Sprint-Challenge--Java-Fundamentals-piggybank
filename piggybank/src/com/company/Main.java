package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double total = 0;
        ArrayList<Money> Bank = new ArrayList<>();



        Bank.add(new Quarter());
        Bank.add(new Dime());
        Bank.add(new Dollar(5));
        Bank.add(new Nickel(3));
        Bank.add(new Dime(7));
        Bank.add(new Dollar());
        Bank.add(new Penny(10));

        for(Money m : Bank){
            System.out.println(m.getQuantity() + " " + m.getName());
        }
        for(Money m : Bank){
           total += m.getValue();
        }

        System.out.println("The piggy bank holds " + fp.format(total));


    }
}
