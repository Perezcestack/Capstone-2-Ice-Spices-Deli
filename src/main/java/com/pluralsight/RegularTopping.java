package com.pluralsight;

import java.util.List;

public class RegularTopping extends Topping {
    public static List<String> toppings = List.of("lettuce","peppers","onions","tomatoes","jalapenos","pickles"
        ,"guacamole","mushrooms","mayo","mustard","ketchup","ranch","thousand islands","vinaigrette","au jus","sauce");
//CHANGE EVERYTHING TO LOWERCASE

    public static List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

}
