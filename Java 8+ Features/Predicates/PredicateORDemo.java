
import java.util.function.Predicate;

public class PredicateORDemo {

    public static void main(String[] args) {

        Predicate<Integer> lessThan0 = n -> n < 0;

        Predicate<Integer> greaterThan100 = n -> n > 100;

        System.out.println(lessThan0.or(greaterThan100).test(50));
        System.out.println(lessThan0.or(greaterThan100).test(101));
        System.out.println(lessThan0.or(greaterThan100).test(-12));
    }

}
