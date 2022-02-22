//Take 2 numbers as input and print the largest number.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 2 numbers to find which one is the largest: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if (num1>num2){
            System.out.println("The Greatest number is: " + num1 );
        }
        if (num2>num1){
            System.out.println("The Greatest number is: " + num2 );
        }
    }
}
