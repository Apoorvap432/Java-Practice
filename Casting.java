
public class Casting {
    public static void main(String[] args) {
        // 1. TYPE CONVERSION: Java automatically converts small data types into larger
        int n = 10;
        double d = n;
        System.out.println(d); // ye int vli value ko double bna dega



        // 2. TYPE CASTING: When bigger data types converted into smaller
        double a = 13.4;
        // int b = a;
        // System.out.println(b); //it will show an error: Type mismatch: cannot convert
        // from double to int


        // -another way-
        int c = (int) a;
        System.out.println(c); // This will print 13 which led to data loss



        //------------------------ Automatic type conversion -------------------------------------
        // If one operand is double → result double.
        // Else if one operand is float → result float.
        // Else if one operand is long → result long.
        // Else → result int.

        int e = 5;
        double f = 13.5;
        System.out.println(e+f);    //this will print 18.5

        //-----------string to int -----------------
        String g = "123";
        int num = Integer.parseInt(g);
        System.out.println(num + 10); // 133

        //-------------int to string--------------
        int h = 55;
        String i = String.valueOf(h);
        System.out.println(i + 10); // "5510"


    }
}
