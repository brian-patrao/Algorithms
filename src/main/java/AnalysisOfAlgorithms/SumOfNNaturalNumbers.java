package AnalysisOfAlgorithms;

import java.util.Scanner;

/*
* Find the sum of n natural numbers
* Sample input = 3
* Sample output = 6
* 1 + 2 + 3 = 6
 */

public class SumOfNNaturalNumbers {

    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //    Alternatively
    //    public static int findSumOfNaturalNumbers(int n) {
    //        return n * (n+1)/2;
    //    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int sum = findSumOfNaturalNumbers(n);
        System.out.println("The sum is = " + sum);
    }
}
