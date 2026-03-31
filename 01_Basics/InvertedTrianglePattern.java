/*
Problem: Print Inverted Triangle Pattern

Description:
Print an inverted right triangle using '*' symbol.

Input:
An integer n

Output:
Inverted triangle pattern

Example:
Input: 5
Output:
* * * * *
* * * *
* * *
* *
*

Approach:
- Start from n stars
- Decrease stars each row
- Outer loop from n to 1
- Inner loop prints stars

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of triangle

        //Outer Loop -> controls rows
        for(int i=n; i>=1; i--) {

            // Inner Loop -> controls coloums
            for(int j=1; j<= i; j++) {
                System.out.print("* "); // print star
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Closing scanner
    }
}
