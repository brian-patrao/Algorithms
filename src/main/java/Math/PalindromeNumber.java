package Math;

import java.util.Scanner;

/*
 * Check if a number is a palindrome or not
 * input = 78987
 * output = true
 *
 * input = 8
 * output = true
 *
 * input = 837
 * output = false
 */
public class PalindromeNumber {

    public static boolean checkPalindrome(int number) {
        int newNumber = 0;
        int numberCopy = number;
        while(numberCopy > 0) {
            int remainder = numberCopy % 10;
            newNumber = newNumber * 10 + remainder;
            numberCopy = numberCopy / 10;
        }
        return newNumber == number;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if its a palindrome");
        int number = input.nextInt();
        boolean answer = checkPalindrome(number);
        System.out.println("Your answer is " + answer);
    }
}
