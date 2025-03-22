package Math;

import java.util.Scanner;

/**
 * Get Prime Factors for a particular number
 * Input: 12
 * Output: 2, 2, 3
 *
 * Input: 13
 * Output: 13
 *
 * Input: 315
 * Output: 3, 3, 5, 7
 */

public class PrimeFactors {

    public static boolean isPrime(int number) {
        return CheckForPrime.optimalSolutionForPrime(number);
    }

    public static void naivePrimeFactors(int number) {
        for(int i =2; i< number; i++) {
            if(isPrime(i)) {
                int factor = i;
                while(number % factor == 0) {
                    System.out.println(i);
                    factor = factor * i;
                }
            }
        }
    }

    public static void betterApproachForPrimeFactors(int number) {
        if(number <= 1)
            return;

        for(int i =2; i*i <= number; i++) {
            while(number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
        if(number > 1)
            System.out.println(number);
    }

    public static void optimalSolutionForPrimeFactors(int number) {
        if(number <= 1)
            return;

        while(number % 2 == 0) {
            System.out.println(2);
            number = number / 2;
        }

        while(number % 3 == 0) {
            System.out.println(3);
            number = number / 3;
        }

        for(int i = 5; i*i <= number; i=i+6) {
            while(number % i == 0) {
                System.out.println(i);
                number = number / i;
            }

            while(number % (i+2) == 0) {
                System.out.println(i+2);
                number = number / i;
            }
        }

        if(number > 3) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numbers to print its prime factors: ");
        int number = input.nextInt();
        optimalSolutionForPrimeFactors(number);
    }
}
