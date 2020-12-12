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

//    public void addQuantity(){    MIGHT BE USED IN THE FUTURE
//        this.quantity += 1;
//    }
//    
//    public void minusQuantity(){  MIGHT BE USED IN THE FUTURE
//        if(this.quantity != 0){
//            this.quantity -= 1;
//        }
//    }
    
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
