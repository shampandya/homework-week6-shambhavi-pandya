package sourcecode;

public class Programme18_Sum {
    /*
      Write a Java program to print the sum (addition), multiply, subtract, divide and
      remainder of two numbers.
      Test Data: Input first number :125
      Input second number: 24
      Expected output: 124+24 = 149
      125-24 = 101
      125*24 = 3000
      125/24 = 5
     125 mod 24 =5
   */
    public static void main(String[] args) {
        int a = 125;
        int b = 24;

        System.out.println("125 + 24 = " +(a+b));
        System.out.println("125 - 24 = " +(a-b));
        System.out.println("125 * 24 = " +(a*b));
        System.out.println("125 / 24 = " +(a/b));
        System.out.println("125 % 24 = " +(125%24));

    }
}

