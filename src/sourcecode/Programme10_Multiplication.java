package sourcecode;

import java.util.Scanner;

public class Programme10_Multiplication {
    /*
    * Write a Java program that takes a number as input and prints its multiplication table
    * up to 10. Test Data: Input a number: 8
    * Expected Output : 8 x 1 = 8
    *                   8 x 2 = 16
    *                   8 x 3 = 24 ...
    *                   8 x 10 = 80

     *
     */

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Input a number: 8");
        int number = scanner.nextInt();

        // Display the multiplication table up to 10
        System.out.println("Multiplication table " + number + ":");
        for (int i = 1; i <= 10; i++)
        {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }




}
