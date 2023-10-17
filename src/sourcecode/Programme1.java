package sourcecode;

public class Programme1 {
    /**
     *   Declare two instance variable
     *   Declare one instance method.
     *    Call both instance variables into the instance method inside the print statement.
     *    Declare the Main method.
     *    Call the above instance method into the Main method and Run the programme.
     */
    int a= 100;
    String name = "shana";        // declare two instance variable

    public static void main(String[] args) {   //declare main method
        Programme1 call1 = new Programme1();     //
        call1.inst();
    }

    public void inst() {                // Declare instance method
        Programme1 call = new Programme1();
        System.out.println(call.a);
        System.out.println(call.name);             // call both variable

    }
}