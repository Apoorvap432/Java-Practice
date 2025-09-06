// Java mein primitive types hote hain (int, char, boolean, etc.) jo basic data ko represent karte hain. 
// Lekin Java ke collections (ArrayList, HashMap, etc.) aur generics sirf objects ke sath kaam karte hain, primitives ke sath nahi. 
// Isi gap ko fill karne ke liye Java ne Wrapper Classes di hain. 

// Wrapper Class = ek aisi class jo primitive ko object ke form mein represent kare.

// 1. Boxing → primitive ko wrapper object me convert karna. 
//    int n = 5; 
//    Integer obj = Integer.valueOf(n); 

// 2. Autoboxing → primitive ko wrapper object me automatic convert karna (Java internally kar deta hai). 
//    int n = 10; 
//    Integer obj = n;  

// 3. Unboxing → wrapper object ko primitive me convert karna. 
//    Integer obj = 20; 
//    int n = obj;  

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // Autoboxing -> primitive to object
        int a = 35;
        Integer obj = a;
        System.out.println(obj);


        //unboxing -> object to primitive
        Integer b = 45;
        int obj2 = b;
        System.out.println(obj2);

        //arrayList 
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        int first = nums.get(0);
        System.out.println("First element: " + first);
    }
    
}
