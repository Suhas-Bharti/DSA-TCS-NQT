/*
Problem: Check Palindrome Number

Description:
Given an integer number, check whether it is a palindrome or not.
A palindrome number is a number that remains the same when its digits are reversed.

Input:
An integer n

Output:
Print whether the number is Palindrome or Not Palindrome

Example:
Input: 121
Output: Palindrome

Input: -121
Output: Not Palindrome

Approach:
- Create a method isPalindrome(int num)
- Store original number in a variable
- Reverse the number using loop:
    - Extract last digit: digit = num % 10
    - Append digit: reverse = reverse * 10 + digit
    - Remove last digit: num = num / 10
- Compare reversed number with original number
- If equal → Palindrome, else → Not Palindrome

Time Complexity: O(d)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number to check for palindrome: ");
        int num = sc.nextInt(); // Number to check

        if(isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is Not a Palindrome.");
        }

        sc.close(); // Close the scanner

    }

    // Method to check if a number is a palindrome or not
    public static boolean isPalindrome(int num) {

        int originalNum = num; // Store the original number
        int reverse = 0; // Initialize reverse to 0

        if(num < 0) {
            return false; // Negative numbers cannot be palindromes
        }

        while(num != 0) {

            int digit = num % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Append the digit to reverse
            num = num / 10; // Remove the last digit from num

        }


        return reverse == originalNum;

    }
}
