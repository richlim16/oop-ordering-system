package customer;

import java.util.ArrayList;
import food.*;

public class Menu {
    private ArrayList<Meal> mealList = new ArrayList<Meal>();
    private ArrayList<Beverage> bevList = new ArrayList<Beverage>();

    public Menu(){
        mealList.add(new Meal("Peanuts", 20.00, mealList.size()+1));
        mealList.add(new Meal("NutsNotPea", 20.00, mealList.size()+1));
        mealList.add(new Meal("Chicken", 25.00, mealList.size()+1));
        mealList.add(new Meal("Siomai", 25.00, mealList.size()+1));
        mealList.add(new Meal("Siomeow", 25.00, mealList.size()+1));
        mealList.add(new Meal("Shabu", 25.00, mealList.size()+1));
        mealList.add(new Meal("ShabuShabu", 25.00, mealList.size()+1));

        bevList.add(new Beverage("Pipsi", 10, bevList.size()+1));
        bevList.add(new Beverage("Cooke", 10, bevList.size()+1));
        bevList.add(new Beverage("Sarsea", 10, bevList.size()+1));
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

    public Order getMeal(int choice, int q){
        return new Order(mealList.get(choice), q);
    }

    public Order getBev(int choice, int q){
        return new Order(bevList.get(choice), q);
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
