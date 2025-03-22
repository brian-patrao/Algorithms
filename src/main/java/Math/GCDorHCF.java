package Math;

import java.util.Scanner;

/*
* Return the GCD/HCF of 2 numbers
* input: 4,8
* output: 4
*/

public class GCDorHCF {

    public static int naiveApproachGCD(int a, int b) {
        int minimum = Math.min(a, b);
        while (minimum > 1) {
            if(a % minimum == 0 && b % minimum == 0) {
                return minimum;
            }
            minimum--;
        }
        return 1;
    }

    public static int euclidApproachGCD(int a, int b) {
        while(a-b != 0) {
            if(a > b) {
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return a;
    }

    public static int optimizedEuclidApproachGCD(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return optimizedEuclidApproachGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers to get its GCD/HCF");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int answer = optimizedEuclidApproachGCD(number,number2);
        System.out.println("Your answer is " + answer);
    }
}
