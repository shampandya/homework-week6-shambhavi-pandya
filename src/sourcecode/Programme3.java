package sourcecode;

public class Programme3 {

    /*
    * 3.1 Declare one instance and one static variable.
    * 3.2 Declare one instance method.
    * 3.3 Declare one static method.
    * 3.4 Call both instance and static variables into both instance and static methods inside the print statements
    * 3.5 Declare the Main method.
    * 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int year = 6;
    static String name = "Havi";

    public static void main(String[] args) {    // call main method
        Programme3 call2 = new Programme3();
        call2.girl();                           // call instance method
        boy();                                  // call static method
    }
    public void girl(){                                                         // Declare instance method
        Programme3 gender = new Programme3();
        System.out.println(year);
        System.out.println(gender.name);
    }
    static public void boy(){                                                   // Declare static method
        Programme3 type = new Programme3();
        System.out.println(type.year);
        System.out.println(Programme3.name);



    }
}

