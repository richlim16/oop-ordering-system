package com.food;

public class Meal extends Food {
    public Meal(){}
    public Meal(String name){
        super(name);
    }
    public Meal(String name, double price){
        super(name, price);
    }

    public Meal(String name, double price, int id){
        super(name, price, id);
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
       return super.getName();
    }

    public void setPrice(double price){
        super.setPrice(price);
    }

    public double getPrice(){
        return super.getPrice();
    }
    public void setID(int ID){
        super.setID(ID);
    }

    public int getID(){
        return super.getID();
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        return super.toString();
    }
}
