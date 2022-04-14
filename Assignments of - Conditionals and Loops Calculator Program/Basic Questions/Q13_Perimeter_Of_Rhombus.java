package com.Bolt;

import java.util.Scanner;

public class Q13_Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //The formula to find Perimeter Of Rhombus is: p = base * 2 + height *2

        System.out.print("Enter value for one side of the Rhombus: ");
        float side = in.nextFloat();
        double perimeter = side * 4;
        System.out.println("The Perimeter of Rhombus is: " + perimeter);
    }
}
