
import java.util.function.Predicate;

public class PredicateIsEqualDemo {

    public static void main(String[] args) {
        Predicate<String> check = Predicate.isEqual("Java");

        System.out.println(check.test("Java"));
        System.out.println(check.test("Python"));
    }
}
