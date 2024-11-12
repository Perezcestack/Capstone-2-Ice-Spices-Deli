package com.pluralsight;

import java.util.*;

import static com.pluralsight.Display.*;

public class Order {
    public List<Orderable> totalOrder = new ArrayList<>();
    public List<Sandwich> sandoList = new ArrayList<>();
    public List<String> regToppingListChoices = new ArrayList<>();
    public List<String> premiumToppingsChoices = new ArrayList<>();
    public List<String> extraPremium = new ArrayList<>();

    Meat meat = new Meat();
    Cheese cheese = new Cheese();
    boolean toasted;
    String sandoName;
    Map<String,Sandwich> orderMap = new HashMap<>();

//    public List<Sandwich> getSandoList() {
//        return sandoList;
//    }

    public void seeTotalPrice() {
    }

    public void newSandoOrder() {
        System.out.println("What type of bread do you want? White,Wheat,Rye or a Wrap");
        String breadChoice = input.nextLine();

        System.out.println("Would you like that toasted?(Yes or No)");
        String toastChoice = input.nextLine();
        toasted = toastChoice.equalsIgnoreCase("Yes");

        System.out.println("What size sandwich do you want 4' 8' or 12'");
        String sizeChoice = input.nextLine();

        System.out.println("What toppings do you want?  (included at no extra cost, even for extra)" +
        "\nWe have " + RegularTopping.getToppings() + "\nThe premium toppings (cost moneys and extra costs money)" +
        " are Cheeses like " + Cheese.premiumCheese + " and " + Meat.premiumMeats + "\nPlease Separate each topping with a |");

        String[] toppingsAnswer = input.nextLine().split("\\|");
//        System.out.println(Arrays.toString(toppingsAnswer));

        //whatever topping is entered first and depending on how many it asks in that order and that many times
        int counter = 0;
        int counterMeat = 0;
        int counterCheese = 0;
        for(String s : toppingsAnswer) {
            //System.out.println(s); .trim doesnt work after next line LOL
            s = s.trim();
            //System.out.println(s);
            if (Meat.premiumMeats.contains(s)) {
                premiumToppingsChoices.add(s);
                if(counterMeat == 0){
                System.out.print("Do you want extra Meat?(Yes or no): ");
                String exChoices = input.nextLine();
                if(exChoices.equalsIgnoreCase("yes")) {
                    System.out.println("Write out any extra Meats you want separated by |");
                    String[] exToppingsAnswer = input.nextLine().split("\\|");
                    for (String e : exToppingsAnswer) {
                        e = e.trim();
                        extraPremium.add(e);
                    }
                    counterMeat++;
                }
                }
            } else if (Cheese.premiumCheese.contains(s)) {
                premiumToppingsChoices.add(s);
                if(counterCheese == 0){
                System.out.print("Do you want extra Cheese?(Yes or no): ");
                String exChoices = input.nextLine();
                if(exChoices.equalsIgnoreCase("yes")) {
                    System.out.println("Write out any extra Cheeses you want separated by |");
                    String[] exToppingsAnswer = input.nextLine().split("\\|");
                    for (String e : exToppingsAnswer) {
                        e = e.trim();
                        extraPremium.add(e);
                    }
                    counterCheese++;
                }
                }
            } else if (RegularTopping.toppings.contains(s)) {
                regToppingListChoices.add(s);
                if(counter == 0){
                System.out.println("Did you want extra of regular topping?(Yes or no)");
                String extraChoice = input.nextLine();
                if(extraChoice.equalsIgnoreCase("yes")) {
                    System.out.println("Write out any extra toppings you want separated by |");
                    String[] exToppingsAnswer = input.nextLine().split("\\|");
                    for (String e : exToppingsAnswer) {
                        e = e.trim();
                        regToppingListChoices.add(e);
                    }
                    counter++;
                }

                }
            }
        }
//            System.out.println(premiumToppingsChoices);
//        System.out.println(regToppingListChoices);
        System.out.println("Whats the name for this sandwich?");
        sandoName = input.nextLine();

        sandoList.add(new Sandwich(sizeChoice, breadChoice, regToppingListChoices, premiumToppingsChoices,extraPremium, toasted));
        System.out.println(sandoList);

        orderScreen();

//        System.out.println(sandoList);
//        orderMap.put(sandoName,sandoList.get(0));
//        System.out.println(orderMap);
//        System.out.println(orderMap.get(sandoName));
    }


    public void newBevForOrder() {
        System.out.println("What drink do you want?");
        String drinkName = input.nextLine();
        System.out.println("What size drink do you want?(Small Medium Large)");
        String drinkSizeChoice = input.nextLine();
        order.totalOrder.add(new Beverage(drinkSizeChoice, drinkName));
        orderScreen();

    }

    public void newChipsForOrder() {
        System.out.println("What chips do you want?");
        String chipName = input.nextLine();
        order.totalOrder.add(new Chips(chipName));
        orderScreen();
    }
}
