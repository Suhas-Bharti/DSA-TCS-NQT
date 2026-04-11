/*
Problem: Reverse a String using StringBuilder (Without Built-in Method)

Description:
Given a string, reverse the string using StringBuilder without using the built-in reverse() method, and print the reversed result.

Input:
- A string s

Output:
- The reversed string

Example:
Input:
hello

Output:
olleh

Approach:
- Initialize an empty StringBuilder
- Traverse the string from end to start
- Append each character to the StringBuilder
- Convert StringBuilder to string and print the result

Time Complexity: O(n)
Space Complexity: O(n)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // method call to reverse the string
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr); // Printing the reversed string

        sc.close(); // Closing the scanner

    }

    // Method to reverse the string using StringBuilder
    public static String reverseString(String str) {

        StringBuilder reverse = new StringBuilder(); // Initialize an empty StringBuilder to store the reversed string

        // Traverse the string from end to start
        for(int i=str.length()-1; i>=0; i--) {
            reverse.append(str.charAt(i)); // Append each character to the StringBuilder
        }

        return reverse.toString(); // Convert StringBuilder to string and return the result
    }
    
}
