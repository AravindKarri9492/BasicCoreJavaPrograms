package com.basiccorejavaprograms.windchill;
import java.util.Scanner;

public class WindChill
{
    public static void main(String[] args)
    {
        double temperature, velocity, windchill;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature and velocity of the air: ");
        temperature = Math.abs(scanner.nextInt());
        velocity = Math.abs(scanner.nextInt());
        scanner.close();

        if(temperature > 50 && (velocity > 120) || (velocity < 3))
        {
            windchill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * (Math.pow(velocity, 0.16));
            System.out.println("Windchill : " + windchill);
        }
        else
        {
            System.err.println("Enter correct values!");
        }
    }
}
