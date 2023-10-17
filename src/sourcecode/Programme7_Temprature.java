package sourcecode;

import java.util.Scanner;

public class Programme7_Temprature {
    /*
     Write a program to insert any
     temperature value in degree Fahrenheit and
     convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give any temp value in Fahrenheit ");
        double fah = scan.nextDouble();
        Programme7_Temprature.m1(fah);
        scan.close();
    }

    public static void m1(double fah) {
        double f = fah - 32 * 5 / 9;
        System.out.println("conversion of degree celcious = " + f);
    }
}
