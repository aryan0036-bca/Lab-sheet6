import java.util.Scanner;

public class Q08_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {5, 10, 15, 20, 25};
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Division result = " + (a / b));

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();
                System.out.println("Array element = " + values[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner error: Invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer error: Cannot divide by zero.");
        }
    }
}
