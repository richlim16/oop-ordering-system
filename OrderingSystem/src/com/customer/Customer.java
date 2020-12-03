package com.customer;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Customer implements ActionListener{
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

    private JTextField tf;

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
            bevButtons[i].addActionListener(this);
            x+=w;
            if(i > 0 && i % 4 == 0){
                i = 0;
                x = 0;
                y+=h;
            }
            frame.add(bevButtons[i]);
        }

        tf = new JTextField("vagina");
        tf.setBounds(0, y+h, 50, 20);
        tf.setEditable(false);
        frame.add(tf);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        tf.setText("penis");
    }
}
