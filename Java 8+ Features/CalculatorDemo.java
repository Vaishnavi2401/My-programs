
@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Multiply: " + multiply.calculate(10, 5));
        System.out.println("Subract: " + subtract.calculate(10, 5));
    }
}
