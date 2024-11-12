package com.pluralsight;

public class Beverage implements Orderable{
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public Beverage(String size, String name) {
        this.size = size;
        this.name = name;
    }

    private String size;
    private String name;

    @Override
    public String toString() {
        return "You got a " + name +
                " size " + size;
    }

    @Override
    public double getprice() {
        if (size.equalsIgnoreCase("Small")){
            return 2.00;
        }else if(size.equalsIgnoreCase("Medium")){
            return 2.50;
        }else if(size.equalsIgnoreCase("Large")){
            return 3.00;
        }
        return 0;
    }
}
