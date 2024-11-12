package com.pluralsight;

import java.util.List;

public class Cheese extends Topping {
    public static List<String> premiumCheese = List.of("American","Provolone","Cheddar","Swiss");
    //CHANGE EVERYTHING TO LOWERCASE
    private final double PRICEOFSMALL = 0.75;
    private final double PRICEOFMEDIUM = 1.50;
    private final double PRICEOFLARGE = 2.25;
    private final double EXTRAPRICESMALL = 0.30;
    private final double EXTRAPRICEMEDIUM = 0.60;
    private final double EXTRAPRICELARGE = 0.90;
}
