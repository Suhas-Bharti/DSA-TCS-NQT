/*
Problem: Rotate Array by K Steps

Description:
Given an array of integers, rotate the array to the right by k steps using the reversal algorithm, and print the rotated array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array
- An integer k, representing the number of rotations

Output:
- The array after rotating it to the right by k positions

Example:
Input:
5
1 2 3 4 5
2

Output:
Rotated array: 4 5 1 2 3

Approach:
- Take k modulo n to handle cases where k > n
- Reverse the entire array
- Reverse the first k elements
- Reverse the remaining n-k elements
- Print the final rotated array

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class RotateArray {
    
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking input for the size of the array

        int[] arr = new int[size]; // Taking input for the elements of the array
        for(int i=0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt(); // Taking input for the number of rotations

        // Function call to rotate the array
        rotateArray(arr, k);

        // Print rotated array
        System.out.print("Rotated array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Closing the scanner
    }

    // Method to rotate the array
    public static void rotateArray(int[] arr, int k) {

        k = k % arr.length; // Handle cases where k is greater then the length of the array

        // Reverse the entire array
        reverse(arr, 0, arr.length -1);

        // reverse the first k elements
        reverse(arr, 0, k-1);

        // reverse the remaining elements
        reverse(arr, k, arr.length -1);


    }

    // Method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
         
        // Swap the elements at start and end pointers until they meet
        while(start < end) {
            int tem = arr[start]; // Store the element at start pointer in a temporary variable
            arr[start] = arr[end]; // Assign the element at end pointer to start pointer
            arr[end] = tem; // Assign the temporary variable (original start element) to end pointer

            start++; // Move the start pointer to the right
            end--; // Move the end pointer to the left
        }
    }
}