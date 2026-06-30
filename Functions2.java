import java.util.*;

public class Functions2 {
    public static int Multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply = Multiply(a, b);
        System.out.println("Product is: " + multiply);
    }

}
