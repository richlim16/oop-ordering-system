package customer;

import java.util.ArrayList;
import food.*;

public class Menu {
    private ArrayList<Meal> mealList = new ArrayList<Meal>();
    private ArrayList<Beverage> bevList = new ArrayList<Beverage>();

    public Menu(){
        mealList.add(new Meal("Peanuts", 20.00, mealList.size()+1));
        mealList.add(new Meal("Lechon", 20.00, mealList.size()+1));
        mealList.add(new Meal("Chicken", 25.00, mealList.size()+1));
        mealList.add(new Meal("Siomai", 25.00, mealList.size()+1));
        mealList.add(new Meal("Ramen", 25.00, mealList.size()+1));
        mealList.add(new Meal("Shabu", 25.00, mealList.size()+1));
        mealList.add(new Meal("ShabuShabu", 25.00, mealList.size()+1));

        bevList.add(new Beverage("Pepsi", 10, bevList.size()+1));
        bevList.add(new Beverage("Coke", 10, bevList.size()+1));
        bevList.add(new Beverage("Sprite", 10, bevList.size()+1));
    }

//    public Menu(Meal meal)

    public void display(){
        System.out.println(this);
    }

    public int mealListSize(){
        return mealList.size();
    }

    public int bevListSize(){
        return bevList.size();
    }

    public String getMealName(int i){
        return mealList.get(i).getName();
    }

    public String getBevName(int i){
        return bevList.get(i).getName();
    }

    public Food getMeal(int choice){
        return mealList.get(choice);
    }

    public Food getBev(int choice){
        return bevList.get(choice);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Meals:"));
        for(Food x : mealList){
            sb.append(String.format("\n%s", x));
        }
        sb.append(String.format("\nBeverages:"));
        for(Beverage y : bevList){
            sb.append(String.format("\n%s", y));
        }

        return sb.toString();
    }


}
