package com.usc;
import com.customer.*;
import com.food.*;
import java.util.Scanner;

public class Main {

    public static int choice;
    public static int ordrID;
    public static int ordrQuantity;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] custOpts = {"Ask for the Menu", "Place an Order", "Finish Ordering"};
        Customer Rick = new Customer("Rick", "Sanchez");
        Menu menu = new Menu();
        Order order = new Order();

        while (choice != 3) {

            System.out.println("How may we help you today?");
            for (int ite = 0; ite < custOpts.length; ite++) {
                System.out.println("[" + (ite + 1) + "]" + custOpts[ite]);
            }
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    //MENU OPTION
                    menu.display();
                    break;

                case 2:
                    //Place an Order

                    //INPUT FOOD ID
                    System.out.println("Input Meal ID: ");
                    ordrID = input.nextInt();

                    if(ordrID <= menu.mealListSize()) {
                        //ENTER QUANTITY
                        System.out.println("How many orders for this item?: ");
                        ordrQuantity = input.nextInt();
                        Rick.addAnOrder(menu.getMeal(ordrID-1, ordrQuantity));
                    } else {
                        System.out.println("Food item is not available...");
                    }

                    //INPUT BEVERAGE ID
                    System.out.println("Input Beverage ID: ");
                    ordrID = input.nextInt();

                    if(ordrID <= menu.bevListSize()) {
                        //ENTER QUANTITY
                        System.out.println("How many orders for this item?: ");
                        ordrQuantity = input.nextInt();
                        Rick.addAnOrder(menu.getBev(ordrID-1, ordrQuantity));
                    } else {
                        System.out.println("Food item is not available...");
                    }

                    Rick.showReceipt();
                    break;

                case 3:
                    System.out.println("Final Order Details are: ");
                    Rick.showReceipt();

            }

        }
    }
}
