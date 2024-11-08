package com.pluralsight;

import java.util.Scanner;

public class Display {
    static Scanner input = new Scanner(System.in);

    public static void homeScreen() {
        System.out.println("Hi welcome to the Deli!\nOur options are: \n(1)New Order\n(2)Exit Application");

    }

    public static void orderScreen() {
        System.out.println("(1)Add Sandwich\n2) Add Drink\n3) Add Chips\n4) Checkout\n0) Cancel Order and go home!");
        String sandoChoice = input.nextLine();

        switch (sandoChoice){
            case "1":

            break;
            case "2":
                System.out.println("What size drink do you want?");
                String drinkChoice = input.nextLine();
                Beverage drink1 = new Beverage(drinkChoice);


        }
    }
}
