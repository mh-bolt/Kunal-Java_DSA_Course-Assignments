package com.Bolt;

import java.util.Scanner;

public class Q1_Area_Of_Circle_Java_Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // First Solution
        System.out.print("Please Enter the Radius of Circle to find Area: ");
        float radius = in.nextFloat();
        double pi = 3.1415926535;
        double area = radius * radius * pi;
        System.out.println("The area of Circle is: " + area);


        // Second Solution:
        System.out.print("Please Enter the Radius of Circle to find Area: ");
        float Radius = in.nextFloat();
        System.out.println("The area of Circle is: " + Radius * Radius * 3.1415926535);
    }
}


