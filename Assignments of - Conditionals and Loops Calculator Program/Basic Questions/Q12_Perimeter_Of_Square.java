package com.Bolt;

import java.util.Scanner;

public class Q12_Perimeter_Of_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter Of Square is: p = base * 2 + height *2

        System.out.print("Enter value for one side of the Square: ");
        float side = in.nextFloat();
        double perimeter = side * 4;
        System.out.println("The Perimeter of Square is: " + perimeter);
    }
}
