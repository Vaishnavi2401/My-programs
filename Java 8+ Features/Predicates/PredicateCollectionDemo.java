
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateCollectionDemo {

    String name, role;

    public PredicateCollectionDemo(String a, String b) {
        name = a;
        role = b;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User name=" + name + ", Role=" + role;
    }

    public static void main(String[] args) {

        List<PredicateCollectionDemo> users = new ArrayList<>();

        users.add(new PredicateCollectionDemo("John", "Admin"));
        users.add(new PredicateCollectionDemo("Peter", "Member"));

        Predicate<PredicateCollectionDemo> predicate = (PredicateCollectionDemo p) -> p.getRole().equals("Admin");

        List admin = process(users, predicate);

        System.out.println(admin);

    }

    private static List process(List<PredicateCollectionDemo> users, Predicate<PredicateCollectionDemo> predicate) {
        List<PredicateCollectionDemo> result = new ArrayList<>();

        for (PredicateCollectionDemo user : users) {
            if (predicate.test(user)) {
                result.add(user);
            }
        }
        return result;
    }

}
