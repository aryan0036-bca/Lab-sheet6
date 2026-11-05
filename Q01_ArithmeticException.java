import java.util.Scanner;

public class Q01_ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
