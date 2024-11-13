package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

public class Display {
    static Scanner input = new Scanner(System.in);
    static Order order = new Order();

    public static void homeScreen() {
        System.out.println("Hi welcome to the Deli!\nOur options are: \n(1)New Order\n(2)Exit Application");
        String homeChoice = input.nextLine();
        if(homeChoice.equals("1")){
            orderScreen();
        }else {
            System.exit(0);
        }
    }

    public static void orderScreen() {
        System.out.println("(1) Add Sandwich\n(2) Add Drink\n(3) Add Chips\n(4) Checkout\n(0) Cancel Order and go home!");
        String sandoChoice = input.nextLine();

        switch (sandoChoice) {
            case "1":
                order.newSandoOrder();
                break;
            case "2":
                order.newBevForOrder();
                break;
            case "3":
                order.newChipsForOrder();
                break;
            case "4":
                order.checkOut();
                //use Sandwichgetprice on checkout for everything in total order
                //double sum = 0 then
                // for(Orderable order : totalOrder){
                // sum += order.getprice;
                //}
                break;
            case"0":
                order.cancelOrder();
                //Set orderlists to null to empty out list and set homescreen to print
        }

    }
}
