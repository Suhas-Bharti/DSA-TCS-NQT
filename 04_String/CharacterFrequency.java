/*
Problem: Find Character Frequency in a String

Description:
Given a string, count and display the frequency of each character in the string.

Input:
- A string s

Output:
- Each character along with its frequency

Example:
Input:
hello

Output:
h : 1
e : 1
l : 2
o : 1

Approach:
- Create an array of size 256 to store frequency of characters
- Traverse the string and increment count for each character
- Traverse the frequency array and print characters with count > 0

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] result = countFrequency(str); // Getting frequency of characters

        // Displaying characters and their frequencies
        System.out.println("Character Frequency:");
        for(int i=0; i<result.length; i++) {
            if(result[i] > 0) {
                System.out.println((char)i + "= " + result[i]);
            }
        }

        sc.close(); // Closing the scanner
    }

    // Method to count and display frequency of characters
    public static int[] countFrequency(String str) {

        str = str.replaceAll("  ", ""); // Removing spaces from the string

        int[] freq = new int[256]; // Assuming ASCII character set

        // Counting frequency of each character
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        return freq; // Returning the frequency array
    }
    
}
