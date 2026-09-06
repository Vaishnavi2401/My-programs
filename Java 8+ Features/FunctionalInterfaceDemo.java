
@FunctionalInterface
interface FuncInterface {

    void abstractFun(int x);

    default void normalFun() {
        System.out.println("Hello");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        FuncInterface fobj = x -> System.out.println(2 * x);
        fobj.abstractFun(5);
    }
}
