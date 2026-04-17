/*
Problem: Find Element in Array using Linear Search

Description:
Given an array of integers and a target element, search for the element in the array using linear search. 
Implement the logic using a function that returns whether the element is found or not.

Input:
- An integer n, the size of the array
- n integers representing the elements of the array
- An integer key, the element to be searched

Output:
- Print "Element Found" if the key exists in the array
- Otherwise, print "Element Not Found"

Example:
Input:
5
50 20 30 45 10
30

Output:
Element Found

Example:
Input:
6
4 2 5 3 7 9
6

Output:
Element Not Found

Approach:
- Take input for array elements and the key
- Pass the array and key to a function
- Traverse the array from index 0 to n-1
- If any element matches the key, return true
- If no match is found, return false
- Print the result based on the returned value

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class FindElement {

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

        // Taking input for the key to be searched
        System.out.print("Enter the element to search: ");  
        int key = sc.nextInt();

        // Calling the linear search method and printing the result
        boolean found = linearSearch(arr, key);
        if(found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close(); // Closing the scanner to prevent resource leak
    }

    // Method to perform linear search
    public static boolean linearSearch(int[] arr, int key) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return true; // Element found
            }
        }

        return false; // Element not found
    }

}