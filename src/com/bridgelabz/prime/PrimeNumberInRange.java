package com.bridgelabz.prime;

import java.util.Scanner;

public class PrimeNumberInRange {
    /**
     * printing the primes between given range.
     * @param lower
     * @param upper
     */
    public static void primeInRange (int lower,int upper){
        System.out.println("Prime numbers between " + lower + " and " + upper + " are : ");
        int count;
        for (int i = lower; i <= upper; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count+1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrimeNumberInRange primeNumberInRange = new PrimeNumberInRange();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range : ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper range : ");
        int upper = scanner.nextInt();
        scanner.close();
        primeNumberInRange.primeInRange(lower,upper);
    }

}
