/*Q3. Write a program where the user enters a number between 1 and 100, and the program converts it into words  using nested switch statements. Example: 45 → "Forty-Five". */
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number between 1 and 100:");
            int number = scanner.nextInt();

            if (number < 1 || number > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else {
                String word = "";

                if (number == 100) {
                    word = "One Hundred";
                } else {
                    int tens = number / 10;
                    int ones = number % 10;

                    switch (tens) {
                        case 1:
                            switch (ones) {
                                case 0:
                                    word = "Ten";
                                    break;
                                case 1:
                                    word = "Eleven";
                                    break;
                                case 2:
                                    word = "Twelve";
                                    break;
                                case 3:
                                    word = "Thirteen";
                                    break;
                                case 4:
                                    word = "Fourteen";
                                    break;
                                case 5:
                                    word = "Fifteen";
                                    break;
                                case 6:
                                    word = "Sixteen";
                                    break;
                                case 7:
                                    word = "Seventeen";
                                    break;
                                case 8:
                                    word = "Eighteen";
                                    break;
                                case 9:
                                    word = "Nineteen";
                                    break;
                            }
                            break;
                        case 2:
                            word = "Twenty";
                            break;
                        case 3:
                            word = "Thirty";
                            break;
                        case 4:
                            word = "Forty";
                            break;
                        case 5:
                            word = "Fifty";
                            break;
                        case 6:
                            word = "Sixty";
                            break;
                        case 7:
                            word = "Seventy";
                            break;
                        case 8:
                            word = "Eighty";
                            break;
                        case 9:
                            word = "Ninety";
                            break;
                    }

                    if (tens != 1 && ones != 0) {
                        switch (ones) {
                            case 1:
                                word += "-One";
                                break;
                            case 2:
                                word += "-Two";
                                break;
                            case 3:
                                word += "-Three";
                                break;
                            case 4:
                                word += "-Four";
                                break;
                            case 5:
                                word += "-Five";
                                break;
                            case 6:
                                word += "-Six";
                                break;
                            case 7:
                                word += "-Seven";
                                break;
                            case 8:
                                word += "-Eight";
                                break;
                            case 9:
                                word += "-Nine";
                                break;
                        }
                    }
                }

                System.out.println("The number " + number + " is " + word);
            }
        }
    }
}
