/*
Problem: Count Occurrences of an Element in an Array

Description:
Given an array of integers and a target element, count how many times the target element appears in the array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array
- An integer key, the element whose occurrences are to be counted

Output:
- The number of times the key appears in the array

Example:
Input:
5
1 2 3 2 2
2

Output:
Count of element: 3

Example:
Input:
4
4 5 6 7
2

Output:
Count of element: 0

Approach:
- Initialize a counter variable to 0
- Traverse the array from index 0 to n-1
- If arr[i] == key, increment the counter
- After traversal, return the count
- Print the result

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Taking input for the size of the array

        // Initialize the array and take input for its elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int key = sc.nextInt(); // Taking input for the key element

        int count = countOccurrences(arr, key); // Calling the method to count occurrences
        System.out.println("Count of element: " + count); // Printing the count of the key element

        sc.close(); // Closing the scanner to prevent resource leak
    }

    // Method to count the occurrences of the key element in the array
    public static int countOccurrences(int[] arr, int key) {
        int count = 0; // Initialize counter variable

        // Traverse the array and count occurrences of the key
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++; // Increment count if current element matches the key
            }
        }

        return count; // Return the total count of occurrences
    }
    
}
