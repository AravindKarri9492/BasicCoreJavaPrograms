package com.basiccorejavaprograms.swap;

import java.util.Scanner;

public class Swap
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to perform swapping : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        //swapping of two numbers using third variable temp
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("first number after swapping is " + num1);
        System.out.println("second number after swapping is " + num2);

    }
}
