package com.pluralsight;

import java.util.List;

public class RegularTopping extends Topping {
    private static List<String> toppings = List.of("lettuce","Peppers","Onions","Tomatoes","Jalapenos","Pickles"
        ,"Guacamole","Mushrooms","Mayo","Mustard","Ketchup","Ranch","Thousand Islands","Vinaigrette","Au Jus","Sauce");


    public static List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "The " +
                "toppings are:" + toppings;
    }
}
