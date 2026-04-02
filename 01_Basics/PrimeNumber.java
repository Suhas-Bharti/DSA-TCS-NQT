/*
Problem: Check Prime Number

Description:
Check whether a given number is a prime number or not. 
A prime number is a number greater than 1 that has no divisors 
other than 1 and itself.

Input:
An integer n

Output:
Print "Prime" if the number is prime, otherwise print "Not Prime"

Example:
Input: 7

Output:
Prime

Approach:
- Take input number n
- If n <= 1, it is not prime
- Loop from i = 2 to sqrt(n)
    - If n % i == 0, then it is not prime
- If no divisors found, it is prime

Time Complexity: O(√n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Takeing input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt(); // Number to check

        // Print whether the number is prime or not
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");

        sc.close(); // Close the scanner
    }

    // Method(Function) to check whether a number is prime or not
    public static boolean isPrime(int num) {

        // Check if num is less than or equal to 1
        if(num <= 1) {
            return false; // Not prime
        }

        // Check for factors from 2 to sqrt(num)
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false; //Not prime
            }
        }

        return true; // Prime
    }

}
