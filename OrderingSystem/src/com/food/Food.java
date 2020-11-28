package com.food;

public class Food {
    private String name;
    private double price;
    private int ID;

    public Food(){}
    public Food(String name){
    this.name = name;
    }

    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Food(String name, double price, int ID){
        this.name = name;
        this.price = price;
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("ID: %d ", ID));
        sb.append(String.format("Name: %-10s", name));
        sb.append(String.format(" Price: %.2f", price));

        return sb.toString();
    }
}

