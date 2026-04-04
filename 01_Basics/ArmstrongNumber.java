/*
Problem: Check Armstrong Number

Description:
Given an integer number, check whether it is an Armstrong number or not.
An Armstrong number is a number that is equal to the sum of its digits 
each raised to the power of the total number of digits.

Input:
An integer n

Output:
Print whether the number is Armstrong or Not Armstrong

Example:
Input: 153
Output: Armstrong

Input: 123
Output: Not Armstrong

Approach:
- Create a method isArmstrong(int num)
- Store the original number in a variable
- Count the number of digits in the number
- Initialize sum = 0
- Loop until num is not equal to 0:
    - Extract last digit: digit = num % 10
    - Calculate power: digit^digits
    - Add to sum: sum = sum + power
    - Remove last digit: num = num / 10
- Compare sum with original number
- If equal → Armstrong, else → Not Armstrong

Time Complexity: O(d)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class ArmstrongNumber {
    
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter an integer number to check for Armstrong: ");
        int num = sc.nextInt(); // Number to check

        boolean result = isArmstrong(num); // Check if number is Armstrong

        // Print the result
        System.out.println(result ? "Armstrong" : "Not Armstrong");

        sc.close(); // Close the scanner
    }

    // Method to check if a number is an Armstrong number or not
    public static boolean isArmstrong(int num) {
        int originalNum = num; // Store the original number
        int digits = 0; // Count of digits
        int sum = 0; // Initialize sum to 0

        // Count the number of digits 
        while (num != 0) {
            digits++;
            num = num / 10; // Remove last digit
        }

        // Count the number of digits
        //int digits = String.valueOf(num).length();

        num = originalNum; // Reset num to original number

        // Calculate sum of digits raised to the power of total digits
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            sum += Math.pow(digit, digits); // Add to sum
            num = num / 10; // Remove last digit
        }

        // Compare sum with original number
        return sum == originalNum;

    }
}
