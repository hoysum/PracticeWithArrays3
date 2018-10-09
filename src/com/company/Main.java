package com.company;

import java.util.Scanner;

//3.Create an array to hold 10 number inputs from the user and print that total to the screen.
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] newArray = new int[10];
        Scanner in = new Scanner(System.in); // call Scanner

        int total=0; //declare new variable "total"
        for (int i = 0; i < newArray.length; i++) {

            System.out.println("Enter numbers 1-10"); //prompt user entry
            newArray[i] = in.nextInt();//store input into array
            total = total + i;
        }
        System.out.println("Total is " + total);
    }
}