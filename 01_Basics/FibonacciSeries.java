/*
Problem: Print Fibonacci Series

Description:
Print the first n terms of the Fibonacci series using a method. 
The Fibonacci series is a sequence where each number is the sum 
of the two preceding ones, starting from 0 and 1.

Input:
An integer n (number of terms to print)

Output:
Print the Fibonacci series up to n terms, separated by spaces.

Example:
Input: 10

Output:
0 1 1 2 3 5 8 13 21 34

Approach:
- Create a method printFibonacciSeries(int num)
- Initialize first two numbers: a = 0, b = 1
- Loop from 0 to num-1
    - Print current number a
    - Calculate next number: next = a + b
    - Update a = b, b = next
- Call method from main with desired n

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int num = sc.nextInt(); // Number of terms to print

        printFibonacciSeries(num); // Call the method to print Fibonacci series

        sc.close(); // Close the scanner
    }

    // Method(Function) to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int num) {
        int a = 0, b = 1; // First two numbers in Fibonacci series

        for(int i=1; i<=num; i++) {
            System.out.print(a + " "); // Print current number a
            int next = a + b; // Calculate the next number in the series
            a = b; // Update a to b
            b = next; // Update b to next
        }
    }
}
