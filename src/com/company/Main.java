package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Grocery planner!");

        ArrayList<String> Grocery_list = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (true) {
            System.out.print("Enter name of item to be added to Grocery list (or type 'quit' to end): ");
            String item = scanner.nextLine();

            if (!item.equalsIgnoreCase("quit")) {
                Grocery_list.add(item);
                counter++;
                System.out.println("Item added: " + item);
            } else break;
        }

        System.out.println("End of list");
        System.out.println();

        System.out.println("Grocery List: ");
        for (String i : Grocery_list) {

            System.out.println(i);
        }
        System.out.println("Total of items in grocery list: " + counter);
    }
}
