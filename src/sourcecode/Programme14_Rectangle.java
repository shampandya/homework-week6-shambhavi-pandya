package sourcecode;

public class Programme14_Rectangle {

    /*
    * 14. Write a Java program to print the area and perimeter of a rectangle.
    *  Test Data: Width = 5.5 Height = 8.5
    * Expected Output:
    * Area is 5.5 * 8.5 = 47.60
    * Perimeter is 2 * (5.5 + 8.5) = 28.20
     */
    public static void main(String[] args) {
            double a = 5.5;
            double b = 8.5;

            System.out.println("Area of a rectangular is: 5.5 *8.5 = " + (a*b));
            System.out.println("Perimeter of a rectangular is: 2* (5.5*8.5) = " +(2*(a+b)));
    }
}
