package customer;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Customer{
    //fields for receipt and menu
    private MyName name;
    private ArrayList<Order> receipt = new ArrayList<Order>();
    private static Menu menu = new Menu();

    //constructors
    public Customer(){}
    public Customer(String firstName){
        name = new MyName(firstName);
    }
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
