
import java.util.function.Predicate;

public class PredicateDemo1 {

    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(20));
    }
}
