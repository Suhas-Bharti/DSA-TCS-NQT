/*
Problem: Check Palindrome String

Description:
Given a string, check whether the string is a palindrome or not. 
A palindrome is a string that reads the same forward and backward.

Input:
- A string s

Output:
- Print "Palindrome" if the string is a palindrome
- Otherwise, print "Not a Palindrome"

Example:
Input:
madam

Output:
Palindrome

Input:
hello

Output:
Not a Palindrome

Approach:
- Initialize two pointers: start = 0 and end = length - 1
- Compare characters at start and end
- If they are not equal, return "Not a Palindrome"
- Move start forward and end backward
- Repeat until start < end
- If all characters match, return "Palindrome"

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Checking if the string is a palindrome
        if(isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome"); 
        }

        sc.close(); // Closing the scanner
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {

        int start = 0, end = str.length() - 1;

        // Case insensitive comparison
        str = str.toLowerCase();

        while(start < end) {
            
            if(str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }

            start++;
            end--;
        }

        return true; // Palindrome
    }
    
}
