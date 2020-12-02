package com.customer;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Customer {
    //fields for receipt and menu
    private MyName name;
    private ArrayList<Order> receipt = new ArrayList<Order>();
    private static Menu menu = new Menu();

    //fields for GUI related variables and arrays/arraylists
    private JFrame frame;
    private JButton mealButtons[] = new JButton[menu.mealListSize()];
    private JButton bevButtons[] = new JButton[menu.bevListSize()];
    private int x = 0;
    private int y = 0;

    //constructors
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
    public void makeOrder(){
        int choice = 1, quantity = 1;
        Scanner scanboi = new Scanner(System.in);
 9i
        do{
            System.out.println("Welcome To JRA Restobar!\n\nWhat would you like to order today?");
            System.out.println(menu);
            System.out.println("1. Meal\n2. Beverage \n0.Show Receipt\nChoice:" );
            choice = scanboi.nextInt();
            switch(choice){
                case 1:
                     System.out.printf("Input Meal ID: ");
                     choice = scanboi.nextInt();
                     System.out.printf("\nHow many orders would you like?: ");
                     quantity = scanboi.nextInt();
                     if(choice >= menu.mealListSize()){
                         System.out.println("Sorry that is an invalid input!");
                     }else{
                         addAnOrder(menu.getMeal(choice-1, quantity));//-1 because 0 == show receipt, so id starts at 1 but is index 0 in array
                     }
                     break;
                case 2:
                    System.out.printf("Input Beverage ID: ");
                    choice = scanboi.nextInt();
                    System.out.printf("\nHow many orders would you like?: ");
                    quantity = scanboi.nextInt();
                    if(choice >= menu.bevListSize()){

                        System.out.println("Sorry that is an invalid input!");
                    }else{
                        addAnOrder(menu.getBev(choice-1, quantity));//-1 because 0 == show receipt, so id starts at 1 but is index 0 in array
                    }
                    break;
                default:
                    System.out.println("Sorry that is an invalid input!\n");
            }
        }while(choice != 0);

        showReceipt();
    }

    public void makeFrame(){
        frame = new JFrame("Customer Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 750);

        //adding meal buttons
        JLabel mealLabel = new JLabel("Meals");
        mealLabel.setBounds(x, y, 50, 25);
        int h = 100;
        int w = 100;
        frame.add(mealLabel);
        y += 30; //update x & y to lower the next set of buttons
        for(int i = 0; i < menu.mealListSize(); i++){
            mealButtons[i] = new JButton(menu.getMealName(i));
            mealButtons[i].setBounds(x, y, w, h);
            x+=w;
            if(i > 0 && i % 4 == 0){
                x = 0;
                y+=h;
            }
            frame.add(mealButtons[i]);
        }
        y+=h;
        x = 0;
        //adding beverage buttons
        JLabel bevLabel = new JLabel("Beverages");
        bevLabel.setBounds(x, y, 75, 25);
        frame.add(bevLabel);
        y+= 30;
        for(int i = 0; i < menu.bevListSize(); i++){
            bevButtons[i] = new JButton(menu.getBevName(i));
            bevButtons[i].setBounds(x, y, w, h);
            x+=w;
            if(i > 0 && i % 4 == 0){
                i = 0;
                x = 0;
                y+=h;
            }
            frame.add(bevButtons[i]);
        }
        frame.setVisible(true);

    }
}
