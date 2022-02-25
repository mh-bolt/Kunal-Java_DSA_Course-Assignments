//To calculate Fibonacci Series up to n numbers.
package com.Bolt;

import java.util.Scanner;

public class Assignment_Q_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i =0;
        int firstnum=0;  //firstnum is the 1 number (0) in the fibonacci series
        int secondnum=1; //secondtnum is the 2 number (1) in the fibonacci series
        System.out.println("Enter the nth value: ");
        int n = input.nextInt(); // just assign it here it's global anyway

        while (i <=n) {
            System.out.println(i+ " ");
            firstnum = secondnum;
            secondnum = i;
            i = firstnum+secondnum;

        }

    }
}
