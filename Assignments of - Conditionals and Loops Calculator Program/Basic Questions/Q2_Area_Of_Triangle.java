package com.Bolt;

import java.util.Scanner;

public class Q2_Area_Of_Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base of Triangle: ");
        double base = in.nextFloat();
        System.out.print("Enter the Height of Triangle: ");
        double height = in.nextFloat();
        double area = base * height * 0.5;
        System.out.println("The Area of Triangle is: " + area);


        // We can also do the Math while outputting our program like:
        System.out.println("The Area of Triangle is: " + base * height * 0.5);
    }
}
