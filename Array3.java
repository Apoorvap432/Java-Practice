//Take an array as input from a user and search for given number x and find the index of the number x in the array. If the number is not found print -1.
import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers in the array: ");
        int numbers [] = new int[size];

        //input
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search for: ");
        int x = sc.nextInt();

        //searching for the number x in the array
        for(int i = 0; i < size; i++){
            if(numbers[i] == x){
                System.out.println("The index of number " + x + " is: " + i);
                break;
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
