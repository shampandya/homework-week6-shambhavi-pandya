package sourcecode;

import java.util.Scanner;

public class Programme6_RadiusOfCircle {

    /*
    * 6. Write a program to enter any
    * radius value of the circle and find out the
    * area.(Formula of Area A=PI*r*r)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        Programme6_RadiusOfCircle obj = new Programme6_RadiusOfCircle();
        obj.calculateArea(radius);

        scan.close();

    }
    public void calculateArea (double radius){
        double totalArea = Math.PI* radius* radius;
        System.out.println("The area of the circle is: " +totalArea);

    }
}
