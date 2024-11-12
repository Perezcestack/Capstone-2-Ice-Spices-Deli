package com.pluralsight;

import java.util.List;

public class SandwichPriceCalc {

    static double calculateSandwich(Sandwich sandwich) {
        double sum = 0;
        if (sandwich.getSize().equals("4")) {
            sum += 5.50;
            for (String topping : sandwich.getPreemToppingsList()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 1.00;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 0.75;
                }
            }
            for (String topping : sandwich.getExtraPremium()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 0.50;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 0.30;
                }
            }
        } else if (sandwich.getSize().equals("8")) {
            sum += 7.00;
            for (String topping : sandwich.getPreemToppingsList()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 2.00;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 1.50;
                }
            }
            for (String topping : sandwich.getExtraPremium()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 1.00;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 0.60;
                }
            }
        } else {
            sum += 8.50;
            for (String topping : sandwich.getPreemToppingsList()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 3.00;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 2.25;
                }
            }
            for (String topping : sandwich.getExtraPremium()) {
                if (Meat.premiumMeats.contains(topping)) {
                    sum += 1.50;
                } else if (Cheese.premiumCheese.contains(topping)) {
                    sum += 0.90;
                }
            }
        }


        return sum;
    }
}
