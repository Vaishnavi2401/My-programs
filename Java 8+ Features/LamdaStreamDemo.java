
import java.util.Arrays;
import java.util.List;

public class LamdaStreamDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tony", "Bob", "Alice", "Charlie", "Aaila");

        System.out.println("All Names: ");
        names.forEach(name -> System.out.println(name));

        System.out.println("Names starting with 'A': ");
        names.stream().filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

    }
}
