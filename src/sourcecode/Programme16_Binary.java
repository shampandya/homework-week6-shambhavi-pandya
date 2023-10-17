package sourcecode;

public class Programme16_Binary {
    /*
        Write a Java program to add two binary numbers.
        Input Data: Input first binary number: 10
         Input second binary number: 11
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = a + b;

        System.out.println("Binary number for two given input is: " + Integer.toBinaryString(c));
    }
}
