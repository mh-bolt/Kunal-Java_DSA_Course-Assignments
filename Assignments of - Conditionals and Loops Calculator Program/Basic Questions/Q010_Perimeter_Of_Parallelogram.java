package com.Bolt;

import java.util.Scanner;

public class Q10_Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter Of Parallelogram is: p = base * 2 + height *2

        System.out.print("Enter the Base of Parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height of Parallelogram: ");
        float height = in.nextFloat();
        double perimeter = base * 2 + height * 2;
        System.out.println("The Perimeter of Parallelogram is: " + perimeter);
    }
}
