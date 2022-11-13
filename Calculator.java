import java.util.function.Function;

public class Calculator {

    interface Operation {
        int operation (int a, int b);
    }

    public static void main(String[] args) {

        Operation addition = (a, b) -> (a+b);
        int result = addition.operation(3, 2);
        System.out.println("a + b = " + result);

        Operation subtraction = (a, b) -> (a-b);
        result = subtraction.operation(3, 2);
        System.out.println("a - b = " + result);

        Operation multiplication = (a, b) -> (a*b);
        result = multiplication.operation(3, 2);
        System.out.println("a * b = " + result);


    }
}