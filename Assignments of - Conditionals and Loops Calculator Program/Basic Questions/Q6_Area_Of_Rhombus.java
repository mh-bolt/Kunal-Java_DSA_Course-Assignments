package com.Bolt;

import java.util.Scanner;

public class Q6_Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to find Area of Rhombus is: A= 0.5 * d1 * d2
        System.out.print("Enter the Length of first Diagonal or d1: ");
        float d1 = in.nextFloat();
        System.out.print("Enter the Length of second Diagonal or d2: ");
        float d2 = in.nextFloat();
        double area = d1 *d2 * 0.5;
        System.out.println("The Area of Rhombus is: " + area);


        // We can also do the Math while outputting our program like:
        System.out.println("The Area of Parallelogram is: " + d1 *d2 * 0.5);
    }
}
