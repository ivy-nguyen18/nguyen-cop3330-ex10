/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex10.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float price;
        int quantity;

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        System.out.println("Enter the price of item 1:");
        price = input.nextFloat();
        item1.setPrice(price);
        System.out.println("Enter the quantity of item 1:");
        quantity = input.nextInt();
        item1.setQuantity(quantity);

        System.out.println("Enter the price of item 2:");
        price = input.nextFloat();
        item2.setPrice(price);
        System.out.println("Enter the quantity of item 2:");
        quantity = input.nextInt();
        item2.setQuantity(quantity);

        System.out.println("Enter the price of item 3:");
        price = input.nextFloat();
        item3.setPrice(price);
        System.out.println("Enter the quantity of item 3:");
        quantity = input.nextInt();
        item3.setQuantity(quantity);

        Total total = new Total(item1, item2, item3);
        String output = String.format("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f", total.subtotal(), total.taxed(), total.totalFinal());

        System.out.println(output);

    }
}
