public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public int module(int a, int b) {
        return a % b
    }

    public static void main(String[] args) {
        Calculator.add(2, 2)
        Calculator.subtract(2, 2)
        Calculator.multiply(2, 2)
        Calculator.divide(2, 2)
        Calculator.module(2, 2)
    }
}