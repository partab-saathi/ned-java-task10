/*Q2. Write a program that uses a switch statement to check whether a number entered by the user is even or odd. */

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            String result;
            switch (number % 2) {
                case 0:
                    result = "Even";
                    break;
                case 1:
                    result = "Odd";
                    break;
                default:
                    result = "Unknown";
            }
            System.out.println("The number " + number + " is " + result);
        }
    }
}
