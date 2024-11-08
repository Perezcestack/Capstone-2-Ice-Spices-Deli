package com.pluralsight;

public class Chips implements Orderable{
   public static final double CHIPS = 1.50;

   @Override
   public double getprice() {
    return CHIPS;
   }
}
//make interface of orderables to connect chips drinks and sandwich ////toppings aren't orderable
//get price could be a method of all