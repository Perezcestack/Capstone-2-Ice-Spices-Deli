package com.pluralsight;

import java.util.List;

public class Sandwich implements Orderable {
    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public String getBreadType() {

        return breadType;
    }

    public void setBreadType(String breadType) {

        this.breadType = breadType;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public List<String> getToppingsList() {

        return toppingList;
    }

    public void setToppingsList(List<String> toppingList) {
        this.toppingList = toppingList;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public Sandwich(String size, String breadType, List<String> toppingList, List<String> preemToppingsList, List<String> extraPremium, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.price = price;
        this.toppingList = toppingList;
        this.preemToppingsList = preemToppingsList;
        this.extraPremium = extraPremium;
        this.isToasted = isToasted;
    }

    private String size;
    private String breadType;
    private double price;
    private List<String> toppingList;

    public List<String> getExtraPremium() {
        return extraPremium;
    }

    private List<String> extraPremium;

    public List<String> getPreemToppingsList() {
        return preemToppingsList;
    }

    private List<String> preemToppingsList;
    private boolean isToasted;

    public double getBreadPrice() {
        if (size.equalsIgnoreCase("4")) {
            setPrice(5.50);
        } else if (size.equalsIgnoreCase("8")) {
            setPrice(7.00);
        } else if (size.equalsIgnoreCase("12")) {
            setPrice(8.50);
        } else {
            throw new IllegalStateException("Sorry that wasn't recognized");
        }
        return this.price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "Your size sandwich is " + this.size + " inches" +
                " with a bread type " + this.breadType +
                " your toppings are " + this.toppingList + ", " + this.preemToppingsList + this.extraPremium +
                " toasted? = " + this.isToasted;
    }

    @Override
    public double getprice() {
        return SandwichPriceCalc.calculateSandwich(this);

    }
}
