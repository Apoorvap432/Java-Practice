public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;    // assign b=5, then increment a to 6
        int c = ++a;    // increment a to 7, then assign c=7
        int d = a--;    // ye phle isko 7 hi dkhaega.. baad m decrement hoga 
        int e = --a;    // phle vla ab 6 bn chuka tha islye ye 5 ho jaegaa 

        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        //-------logical operators--------------
        boolean one = true;
        boolean two = false;

        if (one && two){
            System.out.println("both needs to be true for true");
        } else if(one || two){
            System.out.println("anyone needs to be true to be true");
        } else {
            System.out.println("! reverses the vale");
        }

        //--------------comparison operators---------------
        //  == equal to 
        // != not equal to 
        // > greater than 
        // < less than 
        // >= greater or equal to 
        // <= less or equal to 



        //---------------ternary operator--------------------
        int f = 4;
        int g = 5;
        int greater = (f>g) ? f : g;
        System.out.println(greater);


        //---------------arithmetic operators------------------
        int h = 4;
        int i = 6;
        System.out.println(h+i);
        System.out.println(h-i);
        System.out.println(h*i);
        System.out.println(h/i);
        System.out.println(h%i);
    }
}
