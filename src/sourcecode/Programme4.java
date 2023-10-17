package sourcecode;

public class Programme4 {
    /*
    * 4.1 Declare two instance and two static variables.
    * 4.2 Declare one instance method.
    * 4.3 Declare one static method.
    * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement
    * 4.5 Declare the Main method.
    *4.6 Call both instance and static methods into the Main method and run the programme.
     */

    int age = 5;
    int year= 2017;
    static String name = "Rani";
    static String surname = "maheshwari";                   // Declare for variables

    public void playgroup(){                                // declare instance method

        System.out.println(age);
        System.out.println(year);
        System.out.println(name);
        System.out.println(Programme4.surname);
    }

    public static void nursary(){                                          // Declare static method
        Programme4 carer = new Programme4();                                // Declare object to call instance variable
        System.out.println(carer.age);
        System.out.println(carer.year);
        System.out.println(name);
        System.out.println(Programme4.surname);
    }

    public static void main(String[] args) {                            // Declare main method
        Programme4 school = new Programme4();
        school.playgroup();
        nursary();
    }
}
