package sourcecode;

import java.util.Scanner;

// 9. Write a program to convert the upper case to lower case.

public class Programme9_UpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an uppercase string: ");
        String abc = scan.next();

        String lowercaseString = convertLower(abc);
        System.out.println("Lowercase conversion: " + lowercaseString);

        // Close the scanner
        scan.close();
    }

    // Method to convert a string to lowercase
    public static String convertLower(String abc) {
        return abc.toLowerCase();

    }
}