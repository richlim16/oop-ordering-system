package customer;

import food.*;

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
    
    public String getName(){
        return item.getName();
    }
    public void setQuantity(int q){
        quantity = q;
        price = item.getPrice() * q;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice(){
        return price;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s", item));
        sb.append(String.format(" Quantity: %3d", quantity));
        sb.append(String.format(" Total Price: %5.2f", price));

        return sb.toString();
    }
}
