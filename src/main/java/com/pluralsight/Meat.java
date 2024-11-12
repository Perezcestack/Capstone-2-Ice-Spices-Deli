package com.pluralsight;

import java.util.List;

public class Meat extends Topping {
    public static List<String> premiumMeats = List.of("Steak","Ham","Salami","Roast Beef","Chicken","Bacon");
    //CHANGE EVERYTHING TO LOWERCASE
    private final double MEATSMALL = 1.00;
    private final double MEATMEDIUM = 2.00;
    private final double MEATLARGE = 3.00;
    private final double EXTRAMEATSMALL = 0.50;
    private final double EXTRAMEATMEDIUM = 1.00;
    private final double EXTRAMEATLARGE = 1.50;
}
