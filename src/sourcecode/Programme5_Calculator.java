package sourcecode;

import java.util.Scanner;

public class Programme5_Calculator {
    /*
    5. Write a program for a calculator with addition, subtraction, multiplication
    and division methods all with parameters and use string concatenation methods.
    (Note: Two static and Two instance methods.)
     */

    public static void addition(int value1, int value2) {
        int addition= value1 + value2;
        System.out.println(addition);

    }
    public static void subtraction(int value1,int value2){
        int subtraction = value1 - value2;
        System.out.println(subtraction);
    }
    public void multiplication(int value1,int value2){
        int multiplication = value1 * value2;
        System.out.println(multiplication);
    }
    public void division(int value1, int value2){
        int div = value1 / value2;
        System.out.println(div);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);             // this is predefined object not user defined. standard declaration of object remember
        System.out.println("Please enter your value: ");
        int value1= scan.nextInt();
        System.out.println("Enter another value: ");
        int value2 = scan.nextInt();

        System.out.println("This is additon of two given values"); // calling static method directly
        addition(value1, value2);
        System.out.println("this is sub for two value");
        subtraction(value1,value2);

        Programme5_Calculator calculator = new Programme5_Calculator(); // calling object for two instance method

        System.out.println("Below is  multiplication of two values" );
        calculator.multiplication(value1,value2);
        System.out.println("This is  division of two value");
        calculator.division(value1,value2);


        scan.close();
    }

}

