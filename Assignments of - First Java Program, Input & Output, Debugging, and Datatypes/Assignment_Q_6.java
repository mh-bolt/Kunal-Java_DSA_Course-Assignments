//Input currency in rupees and output in USD.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Currency in Rupees: ");
        float Rupee = input.nextFloat();
        double Rupee_Rate = 74.496157;
        System.out.println("The amount in USD is: " + (Rupee / Rupee_Rate )); // The Rupees rate is from 21,Feb,2022

    }
}
