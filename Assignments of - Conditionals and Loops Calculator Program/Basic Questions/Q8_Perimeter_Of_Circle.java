package com.Bolt;

import java.util.Scanner;

public class Q8_Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter (Circumference) Of Circle is: C = 2πr

        System.out.print("Enter the Diameter of Circle: ");
        float diameter = in.nextFloat();
        float radius = diameter / 2; // Remember that radius of a circle is half of it's diameter
        System.out.println("The Radius of circle is: " + radius);
        double perimeter = 2*3.14159*radius;
        System.out.print("Perimeter of the circle is: " + perimeter);
    }
}
