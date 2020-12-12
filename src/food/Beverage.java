package food;

public class Beverage extends Food{
    public Beverage(){}
    public Beverage(String name){
        super(name);
    }
    public Beverage(String name, double price){
        super(name, price);
    }

    public Beverage(String name, double price, int ID){
        super(name, price, ID);
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    public void setPrice(double price){
        super.setPrice(price);
    }

    public double getPrice(){
        return super.getPrice();
    }

    public void setID(int ID){
        super.setID(ID);
    }

    public int getID(){
        return super.getID();
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        return super.toString();
    }
}
