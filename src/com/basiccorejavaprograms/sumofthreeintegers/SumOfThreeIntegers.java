package com.basiccorejavaprograms.sumofthreeintegers;

import java.util.Scanner;

public class SumOfThreeIntegers
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array elements do you want to add ");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arrayLength;i++)
        {
            array[i]=scanner.nextInt();
        }
        findTriplets(array, arrayLength);
    }
    private static void findTriplets(int[] array, int arrayLength)
    {
        boolean found = false;
        int tripletsCount =0;
        for (int i=0; i<arrayLength-2; i++)
        {
            for (int j=i+1; j<arrayLength-1; j++)
            {
                for (int k=j+1; k<arrayLength; k++)
                {
                    if (array[i]+array[j]+array[k] == 0)
                    {
                        System.out.print(array[i]);
                        System.out.print(" ");
                        System.out.print(array[j]);
                        System.out.print(" ");
                        System.out.print(array[k]);
                        System.out.print("\n");
                        tripletsCount++;
                        found = true;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets :" + tripletsCount);
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println("triplets not exist ");
    }
}
