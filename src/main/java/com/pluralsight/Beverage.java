package com.pluralsight;

public class Beverage implements Orderable{
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Beverage(String size) {
        this.size = size;
    }

    private String size;


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

    public Beverage newBev(String size){
        return new Beverage(size);
    }
}
