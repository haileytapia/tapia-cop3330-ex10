/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int priceItem1, quantItem1, priceItem2, quantItem2, priceItem3, quantItem3;
        double subtotal = 0.0, tax = 0.0, taxRate = 0.055, total = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        priceItem1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quantItem1 = input.nextInt();

        System.out.print("Enter the price of item 2: ");
        priceItem2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quantItem2 = input.nextInt();

        System.out.print("Enter the price of item 3: ");
        priceItem3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quantItem3 = input.nextInt();

        subtotal = (priceItem1 * quantItem1) + (priceItem2 * quantItem2) + (priceItem3 * quantItem3);
        tax = subtotal * taxRate;
        total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}