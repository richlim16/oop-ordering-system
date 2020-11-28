package com.customer;

import java.util.ArrayList;

public class Customer {
    private MyName name;
    private ArrayList<Order> receipt = new ArrayList<Order>();
    private static Menu menu = new Menu();

    public Customer(){}

    public Customer(String firstName, String lastName){
        name = new MyName(firstName, lastName);
    }

    public void addAnOrder(Order chosenOrder){
        receipt.add(chosenOrder);
    }

    public void showReceipt(){
        double total = 0;
        System.out.println(name);
        for(Order x : receipt){
            System.out.println(x);
            total += x.getPrice();
        }

        System.out.println("Total: Php "+total);
    }
}
