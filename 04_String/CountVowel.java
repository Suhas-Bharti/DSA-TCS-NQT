/*
Problem: Count Vowels in a String

Description:
Given a string, count the number of vowels (a, e, i, o, u) present in the string.

Input:
- A string s

Output:
- The total number of vowels in the string

Example:
Input:
hello world

Output:
Number of vowels: 3

Approach:
- Convert the string to lowercase
- Initialize a counter variable
- Traverse each character of the string
- Check if the character is a vowel (a, e, i, o, u)
- If yes, increment the counter
- Return the count

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.Scanner;

public class CountVowel {
    
    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Calling the method to count vowels and printing the result
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);

        sc.close(); // Closing the scanner to prevent resource leak
    }

    // Method to count the number of vowels in the string
    public static int countVowels(String str) {

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        // Initialize a counter variable
        int count = 0;

        // Handle null or empty string case
        if (str == null || str.isEmpty()) {
            return count;
        }

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
