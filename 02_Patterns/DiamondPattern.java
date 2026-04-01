/*
Problem: Print Diamond Pattern

Description:
Print a symmetric diamond pattern using '*' symbol. The pattern 
consists of a full pyramid on top and an inverted pyramid at the 
bottom (excluding the middle row repetition). The number of rows 
for the upper pyramid is given by user input n.

Input:
An integer n (number of rows for the top half of the diamond)

Output:
Diamond pattern of height (2*n - 1) rows

Example:
Input: 5

Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

Approach:
- First, print the top half of the diamond (full pyramid) using:
    - Outer loop for rows (i = 1 to n)
    - Inner loop for spaces (n - i)
    - Inner loop for stars (2*i - 1)
- Then, print the bottom half (inverted pyramid) using:
    - Outer loop for rows (i = n-1 down to 1)
    - Inner loop for spaces (n - i)
    - Inner loop for stars (2*i - 1)
- Move to next line after each row

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class DiamondPattern {
    
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int n = sc.nextInt(); // Size of the diamond

        // Print the top half of the diamond (full pyramid)
        for(int i=1; i<=n; i++) {

            // Print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        // Print the bottom half of the diamond (inverted pyramid)
        for(int i=n-1; i>=1; i--) {

            // Print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }

            // Move to the next line for each row
            System.out.println();
        }

        sc.close(); // Closing scanner
    }
}
