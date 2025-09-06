import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        
        try {
            int num = sc.nextInt();  // agar user string dega to InputMismatchException
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input: " + e);
        }
    }
    
}
