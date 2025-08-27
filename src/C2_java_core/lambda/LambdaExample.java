package C2_java_core.lambda;

import java.util.*;

// 핵심개념: 람다는 함수형 인터페이스(추상 메서드 1개)에 사용 가능
interface Greeting {
    void sayHello(String name);
}

public class LambdaExample {
    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println("Hello, " + name);
        g.sayHello("World");

        // List 정렬에 람다 활용
        List<String> names = Arrays.asList("Bob", "Alice", "Charlie");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("정렬된 리스트: " + names);
    }
}
