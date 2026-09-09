
import java.util.function.Predicate;

public class PredicateNegateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isPostitive = n -> n > 0;

        System.out.println(isPostitive.negate().test(-10));
    }

}
