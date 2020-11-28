package com.customer;

import com.food.*;

public class Order {
    private Food item;
    private int quantity = 1;
    private double price;

    public Order(){}
    public Order(Food item){
        this.item = item;
        price = item.getPrice();
    }

    public Order(Food item, int quantity){
        this.item = item;
        this.quantity = quantity;
        price = item.getPrice() * quantity;
    }

    public double getPrice(){
        return price;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s", item.getName()));
        sb.append(String.format(" Quantity: %d", quantity));
        sb.append(String.format(" Price: %.2f", price));

        return sb.toString();
    }
}
