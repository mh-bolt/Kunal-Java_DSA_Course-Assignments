package com.Bolt;

import java.util.Scanner;

public class Q5_Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The formula to find Area of Parallelogram is: A=b*h
        System.out.print("Enter the Base of Parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height of Parallelogram: ");
        float height = in.nextFloat();
        double area = base * height;
        System.out.println("The Area of Parallelogram is: " + area);


        // We can also do the Math while outputting our program like:
        System.out.println("The Area of Parallelogram is: " + base * height);
    }
}
