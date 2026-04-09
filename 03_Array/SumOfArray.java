/*
Problem: Find Sum of Elements in an Array

Description:
Given an array of integers, calculate and print the sum of all elements present in the array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array

Output:
- The sum of all elements in the array

Example:
Input:
5
1 2 3 4 5

Output:
The sum of the array elements is: 15

Approach:
- Initialize a variable 'sum' to 0
- Traverse the array from index 0 to n-1
- Add each element to 'sum'
- After the loop ends, print 'sum'

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class SumOfArray {
    
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking input for the size of the array
        
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        // Function call to calculate the sum of the array
        int sum = sumOfArray(arr);
        System.out.println("Sum of the array: " + sum); // Print the calculated sum of the array

        sc.close(); // Closing the scanner
    }

    // Method to calculate the sum of the array
    public static int sumOfArray(int[] arr) {
        int sum = 0; // Initialize sum variable to store the sum of the array elements
        for(int i=0; i<arr.length; i++) {
            sum += arr[i]; // Add each element of the array to the sum variable 
        }

        return sum; // Return the calculated sum of the array
    }
}
