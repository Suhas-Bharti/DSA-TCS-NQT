/*
Problem: Print Right Triangle Pattern

Description:
Print a right-angled triangle pattern using '*' symbol.

Input:
An integer n

Output:
Right triangle pattern

Example:
Input: 5
Output:
*
* *
* * *
* * * *
* * * * *

Approach:
- Outer loop runs from 1 to n (rows)
- Inner loop prints stars equal to current row number
- Increase stars row by row

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right triangle:");
        int n = sc.nextInt(); // Size of triangle

        // Outer loop -> controls rows
        for(int i=1; i<=n; i++) {

            // Inner Loop -> controls columns
            for(int j=1; j<=i; j++) {
                System.out.print("* "); // print star
            }
            // Move to next line after each row
            System.out.println();

        }
        sc.close(); // Closing scanner
    }
}
