/*
Problem: Find Largest Element in Array

Description:
Given an array of integers, find and print the largest element in the array.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array

Output:
- The largest integer present in the array

Example:
Input:
5
3 8 2 10 6
Output:
The largest element in the array is: 10

Approach:
- Initialize a variable 'largest' with the first element of the array
- Use a loop to traverse the array from index 1 to n-1
- If the current element is greater than 'largest', update 'largest'
- After the loop ends, print 'largest'

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Size of the array

        int[] arr = new int[size]; // Declaring the array
        for(int i=0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        int result = findLargest(arr); // Calling the method to find the largest element
        System.out.println("The largest element in the array is: " + result); // Printing the largest element   

        sc.close(); // Closing the scanner
    }

    // Method to find the largest element in the array
    public static int findLargest(int[] arr) {

        int largest = arr[0]; // Initialize largest to the first element of the array

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i]; // Update largest if the current element is greater
            }
        }
        
        return largest; // Return the largest element
    }
}