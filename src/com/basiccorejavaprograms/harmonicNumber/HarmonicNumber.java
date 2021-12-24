package com.basiccorejavaprograms.harmonicNumber;

import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter harmonic value: ");
        int number = sc.nextInt();
        if (number > 0)
        {
            for (double i=1;i<=number;i++)
            {
                double harmonicNum += (1/i);
            }
            System.out.println("Nth harmonic number is :"+harmonicNum);
        }
        else
        {
            System.err.println("Enter positive value");
        }
    }
}
