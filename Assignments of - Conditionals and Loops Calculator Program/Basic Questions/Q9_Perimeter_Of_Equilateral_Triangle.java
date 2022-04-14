package com.Bolt;

import java.util.Scanner;

public class Q9_Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter Of Equilateral Triangle is: p = side of the triangle times 3

        System.out.print("Enter value for one side of the Equilateral Triangle: ");
        float side = in.nextFloat();
        float perimeter = side * 3;
        System.out.println("The Perimeter Of Equilateral Triangle is: " + perimeter);
    }
}
