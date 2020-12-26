package customer;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gui.*;

public class Customer{
    //fields for receipt and menu
    private MyName name;
    private Login tableNumber;
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
    
    public Customer(int num){   //table number will represent customer
        tableNumber.getTableNumber();
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
