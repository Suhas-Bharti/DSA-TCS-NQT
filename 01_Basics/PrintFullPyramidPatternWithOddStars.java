/*
Problem: Print Full Pyramid Pattern with Odd Stars

Description:
Print a centered pyramid pattern using '*' symbol where each row 
contains an odd number of stars. The first row starts with 1 star 
and each subsequent row increases by 2 stars, forming a symmetric pyramid.

Input:
An integer n (number of rows of the pyramid)

Output:
Centered pyramid pattern with odd number of stars

Example:
Input: 5

Output:
    *
   ***
  *****
 *******
*********

Approach:
- Use an outer loop for rows (i = 1 to n)
- First inner loop prints spaces (n - i) for centering
- Second inner loop prints stars (2*i - 1)
- Move to next line after each row

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class PrintFullPyramidPatternWithOddStars {
    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the full pyramid: ");
        int n = sc.nextInt(); // size of pyramid

        // Outer Loop -> controls rows
        for(int i=1; i<=n; i++) {

            // First Inner Loop -> controls spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "); // print spaces
            }

            // Second Inner Loop -> controls stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*"); // print stars
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // closing scanner
    }
}
