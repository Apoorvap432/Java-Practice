// == Functional Interface ====================================
interface BinaryCalculator {
    public int binaryOperation(int value1, int value2);
}

// == A Class with a main() method =============================

public class UsingLambdasAsParameters {

    // method that has a parameter of the functional interface type
    public static void printBinaryResult(int a, int b, BinaryCalculator func) {
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        printBinaryResult(3, 4, (a, b) -> a + b); // Addition
        printBinaryResult(3, 4, (a, b) -> a * b); // Multiplication
    }
}
