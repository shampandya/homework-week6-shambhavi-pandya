package sourcecode;

public class Programme2 {
    /* Declare two static variables
     * Declare one static method
     * Call both static variables into the static method inside the print statement.
     * Declare the Main method.
     * Call the static method into the Main method and Run the programme.
     */
    static int age = 70;
    static String surname = "mahant";  // Declare two static variable

    public static void main(String[] args) {    // main method
        one();                                  // call static method in to main method
    }

    public static void one (){                  // Declare one static method
        System.out.println(Programme2.age);     // call variable inside the print statements
        System.out.println(surname);

    }
}
