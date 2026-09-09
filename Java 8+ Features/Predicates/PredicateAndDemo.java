
import java.util.function.Predicate;

public class PredicateAndDemo {

    public static void main(String[] args) {

        Predicate<Integer> graterThan10 = n -> n > 10;

        Predicate<Integer> lessThan50 = n -> n < 50;

        System.out.println(graterThan10.and(lessThan50).test(25));
    }

}
