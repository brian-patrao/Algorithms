package Math;

/*
* Find the number of trailing zeros in Factorial
* input = 5
* output = 1 (5*4*3*2*1)
*
* input = 20
* output = 4
*
* input = 100
* output = 24
* */


import java.util.Scanner;

public class TrailingZerosInFactorial {

    public static int naiveTrailingZeros(int number) {
        double ans = 1;
        for(int i=2; i<=number; i++) {
            ans = ans * i;
        }
        int sum = 0;
        while(ans % 10 == 0) {
            sum++;
            ans = Math.floor(ans/10);
        }
        return sum;
    }

    public static int optimizedTrailingZeros(int number) {
        int sum = 0;
        for(int i=5; i<=number; i = i*5) {
            sum = sum + number/i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its trailing zeros in a factorial");
        int number = input.nextInt();
        int answer = naiveTrailingZeros(number);
        int answer2 = optimizedTrailingZeros(number);
        System.out.println("Your naive answer is " + answer);
        System.out.println("Your optimised answer is " +  answer2);
    }
}
