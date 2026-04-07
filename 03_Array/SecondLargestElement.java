/*
Problem: Find Second Largest Element in Array

Description:
Given an array of integers, find and print the second largest element in the array. 

Input:
- An integer n, the size of the array (n >= 2)
- n integers representing the elements of the array

Output:
- The second largest integer in the array

Example:
Input:
5
3 8 2 10 6
Output:
The second largest element in the array is: 8

Approach:
- Initialize 'largest' and 'secondLargest' with minimum possible values
- Traverse the array:
    - If current element > largest:
        - Update secondLargest = largest
        - Update largest = current element
    - Else if current element > secondLargest and current element != largest:
        - Update secondLargest = current element
- Print secondLargest after traversal

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class SecondLargestElement {
   
    public static void main(String[] args) {
        
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt(); // Taking input for each element of the array
        }

        int result = findSecondLargest(arr); // Calling the method to find the second largest element
        System.out.println("The second largest element in the array is: " + result); // Printing the second largest element
        sc.close(); // Closing the scanner
    }

    // Method to find the second largest element in the array
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE; // Initialize firstLargest to minimum possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest to minimum possible value

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > firstLargest) {
                secondLargest = firstLargest; // Update secondLargest to the previous largest
                firstLargest = arr[i]; // Update firstLargest to the current element
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i]; // Update secondLargest if current element is greater than secondLargest and not equal to firstLargest
            }
        }

        return secondLargest; // Return the second largest element
    }
}
