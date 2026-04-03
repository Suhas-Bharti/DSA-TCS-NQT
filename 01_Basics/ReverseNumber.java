/*
Problem: Reverse a Number

Description:
Given an integer number, reverse its digits using a method.
The reversed number should maintain the sign for negative inputs.

Input:
An integer n

Output:
Print the reversed number

Example:
Input: 12345
Output: 54321

Input: -987
Output: -789

Approach:
- Create a method reverseNumber(int num)
- Initialize reverse = 0
- Loop until num is not equal to 0:
    - Extract last digit: digit = num % 10
    - Append digit to reverse: reverse = reverse * 10 + digit
    - Remove last digit from num: num = num / 10
- Return or print the reversed number

Time Complexity: O(d)  // d = number of digits
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number to reverse: ");
        int num = sc.nextInt(); // Number to reverse

        int res = reverseNumber(num); // Call the method to reverse the number
        System.out.println("Reversed Number: " + res); // Print the reversed number

        sc.close(); // Close the scanner
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int num) {

        int reverse = 0; // Initialize reverse to 0

        while(num != 0) {

            int digit = num % 10; // Extract the last digit

            reverse = reverse * 10 + digit; // Append the digit to reverse

            num = num / 10; // Remove the last digit from num

        }

        return reverse; // Return the reversed number
    }
    
}
