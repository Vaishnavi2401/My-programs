
import java.util.Scanner;

public class TestLamdaFunction {

    public static void main(String[] args) {

        System.out.println("For sum of 2 integers");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");

        int i = scanner.nextInt();

        System.out.println("Enter 2nd number: ");

        int j = scanner.nextInt();

        scanner.close();

        SumCal sumab = (a, b) -> a + b ;

        System.out.println("Sum is: " + sumab.sum(i, j));


    }

}

interface SumCal{

    int sum(int a, int b);
    
}


