package com.Bolt;

import java.util.Scanner;

public class Q11_Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter Of Rectangle is: p = base * 2 + height *2

        System.out.print("Enter the Base of Rectangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height of Rectangle: ");
        float height = in.nextFloat();
        double perimeter = base * 2 + height * 2;
        System.out.println("The Perimeter of Rectangle is: " + perimeter);
    }
}
