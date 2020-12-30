/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import gui.*;
import customer.*;
//import java.io.*;
//import java.net.*;
import staff.*;
/**
 *
 * @author Rich Tristan Lim
 */
public class Main {
    
    public Customer cust;
  
    public static void main(String[] args){
        new Login().setVisible(true);  
        new ChatServer(3000);
    }
    
       
}
