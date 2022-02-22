//Take name as input and print a greeting message for that name.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_2 {
    public static void main(String[] args) {
        System.out.print("Please Enter your FullName: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your FullName is: " + name);



    }
}
