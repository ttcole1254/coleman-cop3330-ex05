package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askFirstNum = new Scanner(System.in);
        System.out.println("What is the first number? ");

        String inputFirstNumS = askFirstNum.nextLine();
        if(inputFirstNumS.isEmpty()) {
            System.out.println("First number is required!!");
        }
        else {
            int inputFirstNum = parseInt(inputFirstNumS);
            Scanner askSecondNum = new Scanner(System.in);
            System.out.println("What is the second number? ");
            String inputSecondNumS = askSecondNum.nextLine();
            if(inputSecondNumS.isEmpty()) {
                System.out.println("Second number is required!");
            }
            else {
                int inputSecondNum = parseInt(inputSecondNumS);
                System.out.println(inputFirstNum + " + " + inputSecondNum + " = " + (inputFirstNum + inputSecondNum) + "\n" + inputFirstNum + " - " + inputSecondNum + " = " + (inputFirstNum - inputSecondNum) + "\n" + inputFirstNum + " * " + inputSecondNum + " = " + (inputFirstNum * inputSecondNum) + "\n" + inputFirstNum + " / " + inputSecondNum + " = " + (inputFirstNum / inputSecondNum));
            }
        }
    }
}
