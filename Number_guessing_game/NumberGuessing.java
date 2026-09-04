
import java.util.Scanner;

public class NumberGuessing {

    public static void guessingNo(){
        Scanner sc = new Scanner(System.in);

        int k = 5;

        System.out.println("A number is chosen between 1 to 100");
        System.out.println("You have total "+ k +" attemptes");

        int num = 1 + (int)(100 * Math.random());

        for (int i = 0; i < k; i++) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if(num == guess){
                System.out.println("Congratulations! you guess the right number...");
                sc.close();
                return;
            }
            else if (guess<num) {
                System.out.println("The number is grater then " + guess);
            }
            else{
                System.out.println("The number is less then " + guess);
            }
            
        }
        System.out.println("You have exausted all the attemps. The correct no. is " + num);
        sc.close();

    }

    public static void main(String[] args) {
        guessingNo();
    }
    
}
