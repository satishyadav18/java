
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name (optional): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        String password = generatePassword(firstName, middleName, lastName, rollNumber);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(String firstName, String middleName, String lastName, String rollNumber) {
        String initials = "" + firstName.charAt(0) + (middleName.isEmpty() ? "" : middleName.charAt(0)) + lastName.charAt(0);

        int length = rollNumber.length();
        String lastFourDigits = rollNumber.substring(Math.max(length - 4, 0));

        return initials + lastFourDigits;
    }
}
