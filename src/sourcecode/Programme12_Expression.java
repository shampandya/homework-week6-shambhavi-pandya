package sourcecode;

public class Programme12_Expression {
    /*
    * 12. Write a Java program to compute the specified expressions
    * and print the output.
    * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    * Expected Output : 2.138888888888889
     */

    static double a = 25.5 * 3.5 - 3.5 * 3.5;
    static double b= 40.5 - 4.5;

    public static void main(String[] args) {
        double c= a/b;

        System.out.println("The answer is: " +c);
    }
}
