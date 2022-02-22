//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(Please input the required values below)\n" + "Principal Amount: " );
        Float P = input.nextFloat();

        System.out.print("Number of Years: ");
        Float T = input.nextFloat();

        System.out.print("Rate: " );
        Float R = input.nextFloat();


        Float SI = (P*T*R)/100;
        System.out.println("Simple Interest is: " + SI);

    }

}
