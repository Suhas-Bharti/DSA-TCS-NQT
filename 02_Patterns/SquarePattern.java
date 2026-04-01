/*
Problem: Print Square Pattern

Description:
Print a square pattern of size n using '*' symbol.

Input:
An integer n

Output:
n x n square pattern

Example:
Input: 5
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Approach:
- Use two nested loops
- Outer loop for rows (0 to n-1)
- Inner loop for columns (0 to n-1)
- Print '*' in each iteration

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square pattern:");
        int n = sc.nextInt(); // Size of square

        // Outer loop → controls rows
        for(int i=0; i<n; i++) {

            // Inner loop → controls columns
            for(int j=0; j<n; j++) {
                System.out.print("* "); // print star
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Closing scanner
    }

}