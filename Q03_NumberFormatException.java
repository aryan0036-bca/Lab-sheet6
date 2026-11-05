import java.util.Scanner;

public class Q03_NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String input = sc.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Integer value = " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The text is not a valid integer.");
        }
    }
}
