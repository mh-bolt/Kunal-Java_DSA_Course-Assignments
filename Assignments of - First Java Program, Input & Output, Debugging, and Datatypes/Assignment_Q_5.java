//Take 2 numbers as input and print the largest number.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 2 numbers to find which one is the largest: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if (num1>num2){
            System.out.println("The Greatest number is: " + num1 );
        }
        if (num2>num1){
            System.out.println("The Greatest number is: " + num2 );
        }
    }
}

// Here's a better way to solve this problem
/*
public class Assignment_Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 2 numbers to find which one is the largest: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if (num1 > num2){
            System.out.println("The Greatest number is: " + num1 );
        }
        else {                                                         // Just use else statement instead of using a nested If statement. This is a much better way.
            System.out.println("The Greatest number is: " + num2 ); 
        }
    }
}

My personal favorite is this

public class Assignment_Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 2 numbers to find which one is the largest: ");
        float largest = 0;             // Assigning a seperate variable with a global scope is a much better solution.
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if (num1 > num2){
        largest = num1; // This means that now num1 is largest
            System.out.println("The Greatest number is: " + largest );
        }
        else{
            System.out.println("The Greatest number is: " + largest );
        }
    }
}

The reason why i like this solution more is because if you were comparing more than 2 values this would come in very useful.
*/
