package com.customer;

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

    //fields for GUI related variables and arrays/arraylists
    private JFrame frame;
    private JButton mealButtons[] = new JButton[menu.mealListSize()];
    private JButton bevButtons[] = new JButton[menu.bevListSize()];
    private int x = 0;
    private int y = 0;

    JPanel rPanel;
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
        JPanel mPanel = new JPanel();//panel where we place our meal buttons
        JPanel bPanel = new JPanel();//panel where we place our beverage buttons
        rPanel = new JPanel();

        GridLayout grid = new GridLayout(0, 5);
        mPanel.setLayout(grid);
        bPanel.setLayout(grid);

        rPanel.setLayout(new BoxLayout(rPanel, BoxLayout.Y_AXIS));

        for(int x = 0; x < menu.mealListSize(); x++){
            JButton m = new JButton(menu.getMealName(x));
            m.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String name = e.getActionCommand();
                    System.out.println(name);
                    JTextField jtf = new JTextField(name);
                    rPanel.add(jtf);
                    frame.pack();
                }
            });
            mPanel.add(m);
            frame.add(mPanel);
            frame.add(rPanel);
            frame.pack();
        }
        frame.setVisible(true);
    }

}
