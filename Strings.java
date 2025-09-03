public class Strings {
    public static void main(String[] args) {
        String str1 = "my string";
        str1.concat("is the best"); // isse kuch ni hoga qki ye nyi string create krega. ise use krne k liye hmee ise str1 ko assign krna pdega.
        str1 = str1.concat(" is the best");

        System.out.println(str1);

        String str3 = new String("Appu");
        String str4 = new String("Appu");
        System.out.println(str3 == str4); // ye false hoga qki objects diffrent h
        System.out.println(str3.equals(str4)); // ye true hoga qki content same h

        String w3 = "Hello";
        String w4 = "hello";
        System.out.println(w3 == w4);  // true (same object from pool)

        //------common string methods -----------
        String w5 = "This is for example";
        String w6 = "Hello Appu, How are you?";

        System.err.println("Uppercase:" + w5.toUpperCase());
        System.out.println("Lowercase: " + w6.toLowerCase());
        System.err.println("charcter at: " + w5.charAt(5));
        System.out.println("concatenation: " + w5.concat(str4));
        System.out.println("Equals(case-sensitive): " + w5.equals(w6));
        System.out.println("Equal(case insensitive): " + w3.equalsIgnoreCase(w4));
        System.out.println("Length: "+ w5.length());
        System.out.println("Replace:" + w5.replace(w5, w6));
        System.out.println("Trimming: " + w6.trim());
        System.out.println("Character index: " + w6.indexOf(str4));

    }
}
