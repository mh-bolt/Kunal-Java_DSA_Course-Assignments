//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the Second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the Operator (+, -, *, /) : ");
        String operator = sc.next();
        double result = 0;

        if (operator.equals("+")){
            result = num1 + num2;
        }
        else if (operator.equals("-")) {
            result = num1 - num2;
        }
        else if (operator.equals("*")) {
            result = num1 * num2;
        }
        else if (operator.equals("/")) {
            result = num1 / num2;
        }
        System.out.println("The result is " + result);

    }
}

// This is very well done.
