
import java.util.function.Predicate;

public class PredicateTestDemo {

    public static void main(String[] args) {

        Predicate<String> isEmpty = str -> str.isEmpty();

        System.out.println(isEmpty.test("Yellow"));
        System.out.println(isEmpty.test(""));
    }

}
