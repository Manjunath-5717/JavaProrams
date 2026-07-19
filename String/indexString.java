package com.pentagon.String;
import java.util.Scanner;

public class indexString {

    // Method to replace a given character with another
    public static String replaceChar(String text, char oldChar, char newChar) {
        if (text == null) {
            return null; // Handle null input safely
        }
        return text.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the original string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get the character to replace
        System.out.print("Enter the character to replace: ");
        char oldChar = sc.next().charAt(0);

        // Get the new character
        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);

        // Call the method
        String result = replaceChar(text, oldChar, newChar);

        // Display result
        System.out.println("Updated string: " + result);

        sc.close();
    }
}
