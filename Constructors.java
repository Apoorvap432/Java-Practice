//Special method-like block, called when object is created using new. Same name as class, no return type (not even void). Used for initialization of objects.

public class Constructors {
    
    public static void main(String[] args) {
        int a = 50;
        System.out.println(a);
    }



//---------default constructor----------------------------


//     class A {}
// class Test {
//     public static void main(String[] args) {
//         A obj = new A(); // works because compiler adds default A(){}
//     }
// }


//-------------------------no-args constructor-----------------------

class A {
    A() {
        System.out.println("No-arg constructor");
    }
}



//--------------------parameterized constructor------------------------

// class A {
//     int x;
//     A(int num) {
//         x = num;
//     }
// }



//-----------------------------constructor overloading----------------------------
// class A {
//     A() { System.out.println("No-arg"); }
//     A(int x) { System.out.println("Value: " + x); }
// }

}
