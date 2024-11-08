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


    @Override
    public double getprice() {
        return 0;
    }
}
