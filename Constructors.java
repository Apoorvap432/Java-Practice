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


 Constructors() {
    System.out.println("No args constructor");
}


}
