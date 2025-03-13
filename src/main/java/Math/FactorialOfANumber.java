package Math;

/*
* Find the factorial of a Number
* input = 4
* output = 24
*
* input = 0
* output = 1
*
* input = 1
* output = 1
*/


import java.util.Scanner;

public class FactorialOfANumber {

    public static int factorialOfANumber(int x) {
        int ans = 1;
        for(int i=2; i<=x; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static int recursiveFactorialOfANumber(int x) {
        if(x == 0) {
            return 1;
        }
        return x * recursiveFactorialOfANumber(x - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial");
        int number = input.nextInt();
        int answer = factorialOfANumber(number);
        int answer2 = recursiveFactorialOfANumber(number);
        System.out.println("Your answer is " + answer);
        System.out.println("Your recursive answer is " +  answer2);
    }
}
