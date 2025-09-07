// Handling an exception → try-catch block use karke program ke andar exception ko handle karna.
// Ducking an exception → method ke signature me throws likh kar responsibility caller ko de dena (khud handle nahi karna).


import java.io.BufferedReader;      //BufferedReader efficient line-by-line reading deta hai.
import java.io.FileReader;          //FileReader file open karta hai.
import java.io.IOException;         //IOException ek checked exception hai jo file I/O me aa sakta hai


public class ExceptionExample2 {

    // ==== Example of DUCKING an exception ====
    // yaha method exception handle nahi karega, sirf declare karega

    public static void readfile(String filename) throws IOException{        //readFile ek utility method hai jo file se ek line read karega.
        BufferedReader br = new BufferedReader(new FileReader(filename));   //filename wali file open hoti hai.
        String line = br.readLine();                                        
        System.out.println("First line from file: " + line);
        br.close();
    }
    public static void main(String[] args) {

        // ==== Example of HANDLING an exception ====

        try{
            int num = Integer.parseInt("abc");              //parseInt kisi valid string ko int mein convert kr deta h 
            System.out.println("The number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception is: " + e);
        }



        // ==== Calling method that DUCKS exception ====
        try{
            readfile("text.txt");
        } catch (IOException e) {
            System.out.println("Exception here is: " + e);
        }
    }
}
