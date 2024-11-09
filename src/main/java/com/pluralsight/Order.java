package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.Display.input;
import static com.pluralsight.Display.order;

public class Order  {
    public List<Orderable> totalOrder = new ArrayList<>();
    public List<Sandwich> sandoList = new ArrayList<>();

    public List<Sandwich> getSandoList() {
        return sandoList;
    }

    public void seeTotalPrice(){

    }
    public void newSandoOrder(){
        System.out.println("What type of bread do you want? White,Wheat,Rye or a Wrap");
        String breadChoice = input.nextLine();
        System.out.println("What size sandwich do you want 4' 8' or 12'");
        String sizeChoice = input.nextLine();
        System.out.println("What toppings do you want?  (included at no extra cost, even for extra)" +
                "\nWe have " + RegularTopping.getToppings() + "\nThe premium toppings (cost moneys and extra costs money)" +
                " are Cheeses like American,Provolone,Cheddar,Swiss and Meats like Steak, Ham, Salami, Roast beef," +
                " Chicken, and Bacon." + "\nPlease Separate each topping with a | \"yo mama\"");



        //new Sandwich(sizeChoice,)
    }
    public void newBevForOrder(){
        System.out.println("What drink do you want?");
        String drinkName = input.nextLine();
        System.out.println("What size drink do you want?");
        String drinkSizeChoice = input.nextLine();
        order.totalOrder.add(new Beverage(drinkSizeChoice,drinkName));

    }
    public void newChipsForOrder(){
        System.out.println("What drink do you want?");
        String chipName = input.nextLine();
        order.totalOrder.add(new Chips(chipName));
    }
}
