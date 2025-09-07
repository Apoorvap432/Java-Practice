//ek hi action (method) alag-alag tariko se perform ho sakta hai.


//Compile time/static polymorphism or Method overloading

class DisplayOverloading{
    void disp(char c){
        System.out.println(c);
    }
    void disp(int a, char b){
        System.out.println(a + " " + b);
    }
    void disp(int t, char y, int a){
        System.out.println(t + " " + y + " " + a);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp(7, 'g');
        obj.disp(4, 'z', 0);
    }
    
}




