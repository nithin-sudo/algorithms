package com.bridgelabz.anagram;
import java.util.Scanner;
public class Anagram
{
    int[] array = new int[256];
    boolean isAnagram = true;
    public void checkAnagram(String stringOne, String stringTwo)
    {
        for(char iterator : stringOne.toCharArray()) {
            int index = iterator;
            array[index] ++;
        }
        for(char iterator : stringOne.toCharArray()) {
            int index = iterator;
            array[index] --;
        }
        for(int i = 0; i < 256; i ++) {
            if(array[i] != 0)
            {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
            System.out.println(" "+ stringOne+ " and " + stringTwo + " are Anagram.");
        else
            System.err.println("" + stringOne + " and " + stringTwo + " are not Anagram.");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String one: ");
        String stringOne = scanner.next();
        System.out.print("Enter String Two: ");
        String stringTwo = scanner.next();

        Anagram anagram = new Anagram();
        anagram.checkAnagram(stringOne, stringTwo);
    }
}
