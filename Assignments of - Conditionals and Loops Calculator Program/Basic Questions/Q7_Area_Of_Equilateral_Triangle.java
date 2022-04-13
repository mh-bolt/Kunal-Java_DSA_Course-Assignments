package com.Bolt;

import java.util.Scanner;

public class Q7_Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //The formula to find Area Of Equilateral Triangle is: A = b * h / 2
        System.out.print("Enter the Base of Equilateral Triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height of Equilateral Triangle: ");
        float height = in.nextFloat();
        double area = base * height / 2;
        System.out.println("The Area of Equilateral Triangle is: " + area);


        // We can also do the Math while outputting our program like:
        System.out.println("The Area of Parallelogram is: " + base * height / 2);
    }
}
