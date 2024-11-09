package com.pluralsight;

import java.util.List;

public class Sandwich implements Orderable{
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

    public List<Topping> getToppingsList() {

        return toppingList;
    }

    public void setToppingsList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public Sandwich(String size, String breadType, double price, List<Topping> toppingList, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.price = price;
        this.toppingList = toppingList;
        this.isToasted = isToasted;
    }

    private String size;
    private String breadType;
    private double price;
    private List<Topping> toppingList;
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
    public double getprice() {
        return 0;
    }
}
