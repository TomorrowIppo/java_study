package C1_java_basics.functions;

public class FunctionOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(3.0, 4.5));
    }
}
