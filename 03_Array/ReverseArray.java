/*
Problem: Reverse an Array

Description:
Given an array of integers, reverse the array in-place and display the reversed array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array

Output:
- The reversed array elements

Example:
Input:
5
1 2 3 4 5

Output:
5 4 3 2 1

Approach:
- Initialize two pointers: start = 0 and end = n-1
- Swap elements at start and end
- Increment start and decrement end
- Repeat until start < end
- Print the reversed array

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking input for the size of the array

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        // Function call to reverse the array
        reverseArray(arr);
 
        // Print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Closing the scanner

    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {

        /*
         * for(int i=arr.length-1; i>=0; i--) {
         * System.out.print(arr[i] + " "); // Print the elements in reverse order
         * }
         */

        int start = 0; // Initialize start pointer
        int end = arr.length - 1; // Initialize end pointer

        while (start < end) {

            // Swap the elements at start and end pointers
            int temp = arr[start]; // Store the element at start pointer in a temporary variable
            arr[start] = arr[end]; // Assign the element at end pointer to start pointer
            arr[end] = temp; // Assign the temporary variable (original start element) to end pointer

            start++; // Move the start pointer to the right
            end--; // Move the end pointer to the left

        }

    }
}
