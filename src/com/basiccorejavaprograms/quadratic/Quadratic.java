package com.basiccorejavaprograms.quadratic;

import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
        findRoots();
    }
    static void findRoots()
    {
        int a, b, c; //represents a ,b & c in a quadratic equation
        double delta, root1, root2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b & c of the quadratic equation: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        delta = Math.pow(b, 2) - 4 * a * c;
        root1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
        root2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Roots of the equation are: " + root1 + " , " + root2);
    }
}
