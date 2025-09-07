// static class ko smjhne k liye phle ye example dkho 
// class Outer {
//     class Inner {
//         void show() {
//             System.out.println("Inner class method (non-static)");
//         }
//     }
// }

// public class Static{
//     public static void main(String[] args) {
//         Outer outer = new Outer();      // pehle outer class ka object
//         Outer.Inner inner = outer.new Inner();  // fir inner class ka object
//         inner.show();
//     }
// }
//⚠ Problem → Har baar Inner ka object banane ke liye pehle Outer ka object banana padega.

//to ise solve krne k liye niche vla static ka example dkho 
// class Outer {
//     static class Inner{
//         void show() {
//             System.out.println("This is the example of static");
//         }
//     }

//     public static void main(String[] args) {
//         Outer.Inner inner = new Outer.Inner();
//         inner.show();
//     }
// }






// -------------------------------------Static Variable-----------------------------------------------
//Ek single copy hoti hai poore class ke liye (har object ke liye alag copy nahi banti). Mostly use hota hai common data store karne ke liye.


// public class Static {
    
//     int rollNo;
//     String name;
//     static String College = "Hmara college";

//     Static (int r, String n) {
//         rollNo = r;
//         name = n;
//     }

//     void display() {
//         System.out.println(rollNo + " " + name + " " + College);
//     }

//     public static void main(String[] args) {
//         Static s1 = new Static(1, "Appu");
//         Static s2 = new Static(2, "Apoorva");

//         s1.display();
//         s2.display();
//     }  }






//-----------------------------------------------static method----------------------------------------
//Static method ko class ke naam se call karte hain (object banane ki zaroorat nahi). Ye sirf static members ko directly access kar sakta hai.
// ise hm class k name se access kr skte h 


// class mathHelper{
//     static int square(int x){
//     return x * x;
// }}

// public class Static {
//     public static void main(String[] args) {
//         int result = mathHelper.square(5);
//         System.out.println(result);
//     }               
// }



//-----------------------------------Static Block------------------------------------------------
//Jab class memory mein load hoti hai, static block automatically execute hota hai. Mostly use hota hai static variable initialize karne ke liye.

class Demo{
    static int num;
    static String name;

    static {
        num = 500;
        name = "Appu";
        System.out.println("Execution of static block");
    }
}

public class Static{
    public static void main(String[] args) {
        System.out.println(Demo.num);
        System.out.println(Demo.name);
    }
}
