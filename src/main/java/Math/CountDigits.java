package Math;

import java.util.Scanner;

/*
* Count the number of digits in a number
* input = 789
* output = 3
 */
public class CountDigits {
    public static int digitCounter(int number) {
        int sum = 0;
        while(number > 0) {
            number = number / 10;
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number whose digits needs to be counted");
        int number = input.nextInt();
        int answer = digitCounter(number);
        System.out.println("Your answer is " + answer);
    }
}
