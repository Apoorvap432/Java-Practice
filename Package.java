import java.util.Scanner; //built in package java ka. Scanner ka use hota hai user se input lene k liyee 
import Packages.Message; //ye hmne jo package bnaya hai usko hmne import kr liaa 

public class Package {
    public static void main(String[] args) {    //Y hota h program ka entry point

        //--------------built in package ka use ------------------------

        Scanner sc = new Scanner(System.in);    // Yaha pe Scanner ek sc naam ka object bna rha hai. "System.in" la mtlv hai keyboard se input lena
        System.out.print("Enter your name: ");  //yaha print use kia hai to cursor same line m rhega, Println use krte to cursor next line m chla jata
        String name = sc.nextLine();            //yaha name naam var user se poora ek line ka input lega, space including
        System.out.println("Hello, " + name);



        //--------------user-defined package------------------
        Message msg = new Message();  //naya obj bna liaa 
        msg.Greet();
    }
}
