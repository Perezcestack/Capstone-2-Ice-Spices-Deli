package com.pluralsight;

import java.util.*;

import static com.pluralsight.Display.*;

public class Order {
    public List<Orderable> totalOrder = new ArrayList<>();
    public List<String> regToppingListChoices = new ArrayList<>();
    public List<String> premiumToppingsChoices = new ArrayList<>();
    public List<String> extraPremium = new ArrayList<>();
    boolean toasted;
    String sandoName;
    String breadChoice;
    String sizeChoice;
    String toastChoice;
    Map<String, Sandwich> orderMap = new HashMap<>();

    //    public List<Sandwich> getSandoList() {
//        return sandoList;

    //screen for making a new sandwich
    public void newSandoOrder() {
        while (true) {
            System.out.println("What type of bread do you want? White,Wheat,Rye or a Wrap");
            breadChoice = input.nextLine();
            if (breadChoice.equalsIgnoreCase("White") || breadChoice.equalsIgnoreCase("Wheat")
                    || breadChoice.equalsIgnoreCase("Rye") || breadChoice.equalsIgnoreCase("Wrap")) {
                break;
            } else {
                System.out.println("Sorry that input was invalid!");
            }
        }
        while (true) {
            System.out.println("Would you like that toasted?(Yes or No)");
            toastChoice = input.nextLine();
            if (toastChoice.equalsIgnoreCase("Yes")) {
                toasted = true;
                break;
            } else if(toastChoice.equalsIgnoreCase("no")){
                toasted = false;
            }else {
                System.out.println("Sorry that input was invalid");
            }
        }

        while (true) {
            System.out.println("What size sandwich do you want 4' 8' or 12'");
            sizeChoice = input.nextLine();
            if (sizeChoice.equals("4") || sizeChoice.equals("8") || sizeChoice.equals("12")) {
                break;
            } else {
                System.out.println("Sorry, that wasn't recognized");
            }
        }
        System.out.println("What toppings do you want?  (included at no extra cost, even for extra)" +
                "\nWe have " + RegularTopping.getToppings() + "\nThe premium toppings (cost moneys and extra costs money)" +
                " are Cheeses like " + Cheese.premiumCheese + " and " + Meat.premiumMeats + "\nPlease Separate each topping with a |");

        String[] toppingsAnswer = input.nextLine().toLowerCase().split("\\|");
//        System.out.println(Arrays.toString(toppingsAnswer));
        //whatever topping is entered first and depending on how many it asks in that order and that many times
        int counter = 0;
        int counterMeat = 0;
        int counterCheese = 0;
        for (String s : toppingsAnswer) {
            //System.out.println(s); .trim doesnt work after next line LOL
            s = s.trim();
            //System.out.println(s); debugging and below is asking if they want extra meat or not
            if (Meat.premiumMeats.contains(s)) {
                premiumToppingsChoices.add(s);
                if (counterMeat == 0) {
                    System.out.print("Do you want extra Meat?(Yes or no): ");
                    String exChoices = input.nextLine();
                    if (exChoices.equalsIgnoreCase("yes")) {
                        System.out.println("Write out any extra Meats you want separated by |");
                        String[] exToppingsAnswer = input.nextLine().split("\\|");
                        for (String e : exToppingsAnswer) {
                            e = e.trim();
                            extraPremium.add(e);
                        }
                    }
                    counterMeat++;
                }
                //asking and sorting cheese into its list
            } else if (Cheese.premiumCheese.contains(s)) {
                premiumToppingsChoices.add(s);
                if (counterCheese == 0) {
                    System.out.print("Do you want extra Cheese?(Yes or no): ");
                    String exChoices = input.nextLine();
                    if (exChoices.equalsIgnoreCase("yes")) {
                        System.out.println("Write out any extra Cheeses you want separated by |");
                        String[] exToppingsAnswer = input.nextLine().split("\\|");
                        for (String e : exToppingsAnswer) {
                            e = e.trim();
                            extraPremium.add(e);
                        }
                    }
                    counterCheese++;
                }
            } else if (RegularTopping.toppings.contains(s)) {
                regToppingListChoices.add(s);
                if (counter == 0) {
                    System.out.println("Did you want extra of regular topping?(Yes or no)");
                    String extraChoice = input.nextLine();
                    if (extraChoice.equalsIgnoreCase("yes")) {
                        System.out.println("Write out any extra toppings you want separated by |");
                        String[] exToppingsAnswer = input.nextLine().split("\\|");
                        for (String e : exToppingsAnswer) {
                            e = e.trim();
                            regToppingListChoices.add(e);
                        }
                    }
                    counter++;
                }
            }
        }
//        System.out.println(premiumToppingsChoices); debugging
//        System.out.println(regToppingListChoices);more debugging
        System.out.println("Whats the name for this sandwich?");
        sandoName = input.nextLine();
        totalOrder.add(new Sandwich(sizeChoice, breadChoice, regToppingListChoices, premiumToppingsChoices, extraPremium, toasted));
//        for(Orderable order : totalOrder){
//            if(order instanceof Sandwich s){
//                System.out.println(s);
//            }
//        } this is if i want to print out only sandwiches in my total order
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

    public void cancelOrder() {
        System.out.println("Would you like to cancel your order? (yes or no)");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            totalOrder.clear();
        } else if (choice.equalsIgnoreCase("no")) {
            orderScreen();
        } else {
            System.out.println("Sorry that wasn't recognized!");
            orderScreen();
        }
    }
}
