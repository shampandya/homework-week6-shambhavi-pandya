package sourcecode;

import java.util.Scanner;

// 8. Write a program to calculate the area of a triangle.

public class Programme8_Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double one = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double two = scanner.nextDouble();

        Programme8_Triangle obj = new Programme8_Triangle(); //declare object
        obj.tri(one, two);
        scanner.close();
    }

    public void tri (double one, double two ){
        double three = 0.5*two*one;
        System.out.println("The area of a teiangle is : " +three);
    }
}
