/*
Problem: Reverse a String

Description:
Given a string, reverse the string and print the reversed result.

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
- Convert the string into a character array
- Initialize two pointers: start = 0 and end = length - 1
- Swap characters at start and end
- Move start forward and end backward
- Repeat until start < end
- Convert the character array back to string and print

Time Complexity: O(n)
Space Complexity: O(n)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class ReverseStringUsingTwoPointer {
    
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

    // Method to reverse the string
    public static String reverseString(String str) {

        // Convert string to character array
        char[] charArray = str.toCharArray();

        //Initialize two pointers
        int start = 0, end = charArray.length - 1;

        // Swap characters until start < end
        while(start < end) {
            char temp = charArray[start]; // Store the character at start in temp
            charArray[start] = charArray[end]; // Assign the character at end to start
            charArray[end] = temp; // Assign the character stored in temp to end

            start++; // Move start forward
            end--; // Move end backward
        }

        return new String(charArray); // Convert character array back to string and return
    }
}
