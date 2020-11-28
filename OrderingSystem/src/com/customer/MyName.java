package com.customer;


public class MyName {
    private String firstName;
    private String lastName;
    private char MI;

    public MyName(){}
    public MyName(String firstName){
        this.firstName = firstName;
    }

    public MyName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MyName(String firstName, String lastName, char MI){
        this.firstName = firstName;
        this.lastName = lastName;
        this.MI = MI;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setMI(char MI){
        this.MI = MI;
    }

    public char getMI(){
        return MI;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s ", firstName));
        if(MI != '\0'){
            sb.append(String.format("%c ", MI));
        }
        if(!(lastName.isEmpty())){
            sb.append(String.format("%s", lastName));
        }


        return sb.toString();
    }
}
