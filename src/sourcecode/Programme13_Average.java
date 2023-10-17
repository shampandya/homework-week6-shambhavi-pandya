package sourcecode;

import java.util.Scanner;

public class Programme13_Average {

     // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

         public static void main(String[] args) {
             // Create a Scanner object to read user input
             Scanner scan = new Scanner(System.in);

             // Prompt the user to enter three numbers
             System.out.print("Enter the first number: ");
             double num1 = scan.nextDouble();

             System.out.print("Enter the second number: ");
             double num2 = scan.nextDouble();

             System.out.print("Enter the third number: ");
             double num3 = scan.nextDouble();

             // Calculate the average
             double average = Average(num1, num2, num3);

             // Display the result
             System.out.println("The average of the three numbers is: " + average);

             // Close the scanner
             scan.close();
         }

         // Method to calculate the average of three numbers
         public static double Average(double num1, double num2, double num3) {
             return (num1 + num2 + num3) / 3.0;
         }
}
