package com.Bolt;

import java.util.Scanner;

public class Q4_Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base of Isosceles Triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the Value for one Side of Isosceles Triangle: ");
        float side = in.nextFloat();

        // We only have the values for Base and Side of Isosceles Triangle, so first we have to find the height of it
        double height_math1 = base/2 * base/2; /*To do that we have to divide Base by 2 and then find the Squared value of it
        for example: 10 / 2 = 5 and 5 * 5 = 25 which is the Squared Value of it. */

        double height_math2 = side * side - height_math1; /*Then we find the Squared Value for the side of Isosceles Triangle
        after we find the Squared Value for it then we have to Subtract the Squared Value of Base from both Side and Base to
        Isolate h (height). Example: side: 13 * 13 = 169 - 25 and 25 - 25 (25 Is the Squared value of Base) */

        double height_math3 = Math.sqrt(height_math2); /* Then what we are left with is the remainder of Side and afterwards
        find the Principal Root of Side where we use the Math.sqrt method. Example: 169 - 25 = 144 and Principal Root of 144 is 12. */

        System.out.println("The Height of Isosceles Triangle is: " + height_math3); // Here we output the Height value (12)
        double area = base * height_math3 * 0.5; // To find the Area of Isosceles Triangle we use this formula
        System.out.println("The Area of Isosceles Triangle is: "+ area); // What we are left with is the area of Isosceles Triangle
    }
}
