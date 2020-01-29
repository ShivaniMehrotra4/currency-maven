package com.knoldus;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args)
    {
        int currency_code_old,currency_code_new;
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter app");
        System.out.println("\n\nChoose currency code to be converted, from the below list");
        System.out.println("1. USD (U.S. Dollars) \n2.INR (Indian Rupee) \n3.AUD(Australian Dollar");
        currency_code_old=scanner.nextInt();

        System.out.println("\n\nChoose currency code to be converted INTO, from the below list");
        System.out.println("1. USD (U.S. Dollars) \n2.INR (Indian Rupee) \n3.AUD(Australian Dollar");
        currency_code_new=scanner.nextInt();



        if(currency_code_old==currency_code_new)
        {
            System.out.println("You chose the same currencies. Value remains the same");
        }
        else
        {
            System.out.println("\n\nEnter the amount to be converted");
            amount=scanner.nextDouble();

            switch(currency_code_old)
            {
                case 1: if(currency_code_new==2)
                {
                    System.out.println("Amount in rupees : " + amount*71.2);
                }
                else if(currency_code_new==3)
                {
                    System.out.println("Amount in australian dollar : " + amount*1.48);
                }
                    break;
                case 2: if(currency_code_new==1)
                {
                    System.out.println("Amount in US Dollars : " + amount*0.014);
                }
                else if(currency_code_new==3)
                {
                    System.out.println("Amount in australian dollar : " + amount*0.21);
                }
                    break;
                case 3: if(currency_code_new==1)
                {
                    System.out.println("Amount in US Dollars : " + amount*0.68);
                }
                else if(currency_code_new==2)
                {
                    System.out.println("Amount in rupees : " + amount*48.7);
                }
                    break;
                default:System.out.println("You chose the wrong currency - code - value.");
            }
        }
    }
}
