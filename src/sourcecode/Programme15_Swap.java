package sourcecode;

public class Programme15_Swap {
 // Write a Java program to swap two variables.

    public static void main(String[] args) {
        int a = 10;
        int b =20;
        System.out.println("Before swap a is = " +a+ "and b = " +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swap a = " +a+ "and b = " +b);
    }
}
