import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

public class Q13_DrugDosageValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();
            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();
            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage must be greater than 0 and at most 1000 mg.");
            }
            System.out.println("Dosage validated for " + patient + ".");
            System.out.println("Drug: " + drug + ", Dosage: " + dosage + " mg");
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be numeric.");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}
