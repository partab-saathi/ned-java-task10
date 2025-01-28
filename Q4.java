
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a password:");
            String password = scanner.nextLine();
            String strength = checkPasswordStrength(password);
            System.out.println("Password Strength: " + strength);
        }
    }

    public static String checkPasswordStrength(String password) {
        String strength = "";
        int length = password.length();
        switch (length) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                strength = "Weak";
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                strength = "Moderate";
                break;

            default:
                if (length > 10 && containsUppercase(password) && containsLowercase(password)
                        && containsDigit(password) && containsSpecialCharacter(password)) {
                    strength = "Strong";
                } else {
                    strength = "Moderate";
                }
        }

        return strength;
    }

    public static boolean containsUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean containsLowercase(String password) {
        return password.matches(".*[a-z].*");
    }

    public static boolean containsDigit(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean containsSpecialCharacter(String password) {
        return password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
}
