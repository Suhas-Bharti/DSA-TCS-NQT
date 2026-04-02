/*
Problem: Find Factorial of a Number Using Method

Description:
Calculate the factorial of a given number using a method.
Factorial of a number n (n!) is the product of all positive 
integers less than or equal to n.

Input:
An integer n

Output:
Print factorial of the number

Example:
Input: 5

Output:
120

Approach:
- Create a method factorial(int n)
- If n == 0 or n == 1, return 1
- Otherwise, multiply numbers from 1 to n
- Return the result
- Call the method in main() and print result

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt(); // Number to find factorial of

        long result = factorial(num); // Call the factorial method  
        System.out.println("Factorial of " + num + " is: " + result); // Print the result

        sc.close(); // Close the scanner
    }

    // Method(Function) to calculate factorial of a number
    public static long factorial(int num) {
        if(num == 0 || num == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }

        long result = 1; // Varialbe to store factorial result

        for(int i=2; i<=num; i++) {
            result *= i; // Multiply result by i
        }

        return result; // Return the factorial result
    }
}
