//Write a program to print whether a number is even or odd, also take input.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("The Number is Even");
            else
            System.out.println("The Number is Odd");




    }
}
