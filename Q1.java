/*Q1. Write a program where the user enters a color (Red, Yellow, Green), and the program displays the corresponding traffic light message ("Stop", "Get Ready", "Go").
 */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter a traffic light color (Red, Yellow, Green):");
        String color = scanner.nextLine().trim().toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color! Please enter Red, Yellow, or Green.");
                break;
        }
        scanner.close();
    }
}
}
