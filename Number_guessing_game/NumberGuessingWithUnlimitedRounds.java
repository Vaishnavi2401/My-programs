
import java.util.Scanner;

public class NumberGuessingWithUnlimitedRounds {

    public static void numberGuessing() {
        try {

            Scanner sc = new Scanner(System.in);

            int k = 5;
            int num = 1 + (int) (100 * Math.random());
            boolean correctGuess = false;
            int attempt = 0;

            System.out.println("A number is chosen between 1 and 100.");
            System.out.println("you have" + k + " attempt per round to guess the number");

            while (!correctGuess) {
                for (int i = 0; i < k; i++) {
                    System.out.println("Enter your guess: ");
                    int guess = sc.nextInt();
                    attempt++;
                    if (guess == num) {
                        System.out.println("You have guessed the correct number in " + attempt + " attempts");
                        sc.close();
                        correctGuess = true;
                        break;
                    } else if (guess > num) {
                        System.out.println("Number is less then the guess");
                    } else {
                        System.out.println("Number is grater then the guess");
                    }
                }

                if (!correctGuess) {

                    System.out.println("You have used all " + k + " attempts");

                    System.out.println("Do you want to continue guessing? (yes/no)");
                    String response = sc.next();

                    if (!response.equalsIgnoreCase("yes")) {
                        System.out.println("Game Over!.. Correct number was :" + num);
                        break;
                    }

                }

            }
            sc.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        numberGuessing();
    }
}
