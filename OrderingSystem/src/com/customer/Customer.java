package com.customer;

import java.util.ArrayList;
import java.util.Scanner;
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
    public void makeOrder(){
        int choice = 1, quantity = 1;
        Scanner scanboi = new Scanner(System.in);

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
                         addAnOrder(menu.getMeal(choice, quantity));
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
                        addAnOrder(menu.getBev(choice, quantity));
                    }
                    break;
                default:
                    System.out.println("Sorry that is an invalid input!\n");
            }
        }while(choice != 0);

        showReceipt();
    }
}
