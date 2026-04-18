/*
Problem: Find Minimum Element in Array

Description:
Given an array of integers, find and print the minimum element present in the array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array

Output:
- The minimum element in the array

Example:
Input:
5
8 3 6 1 9

Output:
Minimum element: 1

Approach:
- Initialize a variable min with the first element
- Traverse the array from index 1 to n-1
- If current element is smaller than min, update min
- Return min and print it

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class FindMinimumElement {

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking input for the size of the array

        // Check if the array is empty
        if (size == 0) {
            System.out.println("Array is empty");
            sc.close();
            return;
        }

        // Initialize the array and take input for its elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        // Calling the method to find the minimum element and printing the result
        int minElement = findMinimum(arr);
        System.out.println("Minimum element: " + minElement); // Printing the minimum element

        sc.close(); // Closing the scanner
    }

    // Method to find the minimum element in the array
    public static int findMinimum(int[] arr) {

        int min = arr[0]; // Initialize min with the first element of the array

        // Traverse the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // If current element is smaller than min
                min = arr[i]; // Update min
            }
        }
        return min; // Return the minimum element found
    }

}
