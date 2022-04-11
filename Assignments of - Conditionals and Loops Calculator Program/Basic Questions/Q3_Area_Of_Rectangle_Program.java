package com.Bolt;

import java.util.Scanner;

public class Q3_Area_Of_Rectangle_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        float length = in.nextFloat();
        System.out.print("Enter the Width of Rectangle: ");
        float width = in.nextFloat();
        double area = length * width;
        System.out.println("The area of Rectangle is: " + area);


        // We can also do the Math while outputting our program like:
        System.out.println("The Area of Rectangle is: " + length * width);
    }
}
