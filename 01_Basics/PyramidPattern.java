/*
Problem: Print Pyramid Pattern

Description:
Print a centered pyramid pattern using '*' symbol.

Input:
An integer n

Output:
Pyramid pattern

Example:
Input: 5

Output:
    *
   * *
  * * *
 * * * *
* * * * *

Approach:
- Outer loop for rows
- First inner loop for spaces
- Second inner loop for stars

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid:");
        int n = sc.nextInt(); // size of input

        //Outer Loop -> controls rows
        for(int i=1; i<=n; i++) {
             
            // First Inner Loop -> controls spaces
            for(int j=1; j<=n-i; j++) {
                // Print spaces
            System.out.print(" ");
            }

            // Second Inner Loop -> controls stars
            for(int j=1; j<=i; j++) {
                // Print stars
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Closing scanner  
    }
}