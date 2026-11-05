import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q11_BankWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal cannot be negative.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient account balance.");
            }
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance = " + (balance - amount));
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
    }
}
