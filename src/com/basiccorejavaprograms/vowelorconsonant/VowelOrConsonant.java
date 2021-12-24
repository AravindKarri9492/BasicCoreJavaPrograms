package com.basiccorejavaprograms.vowelorconsonant;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet to check it is vowel or consonant :");
        char ch = scanner.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'|| ch == 'I'|| ch == 'O' ||ch == 'U')
        {
            System.out.println(ch +" is an vowel");
        }
        else
        {
            System.out.println(ch+" is an consonant");
        }
    }
}
