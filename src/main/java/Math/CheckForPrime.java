package Math;

import java.util.Scanner;

/**
 * The goal is to check if a number is prime or not
 * input: 1031
 * output: true
 *
 * input: 2
 * output: true
 *
 * input: 6
 * output: false
 */
public class CheckForPrime {

    public static boolean naiveCheckForPrime(int number) {
        if(number==1) {
            return false;
        }

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean betterApproachForPrime(int number) {
        if(number==1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) { // can also do i * i <= n
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean optimalSolutionForPrime(int number) {
        if(number==1) {
            return false;
        }

        if(number == 2 || number == 3) {
            return true;
        }

        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for(int i = 5; i <= Math.sqrt(number); i=i+6) {
            if(number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numbers to check whether it is prime or not");
        int number = input.nextInt();
        boolean answer = optimalSolutionForPrime(number);
        System.out.println("Your answer is " + answer);
    }
}
