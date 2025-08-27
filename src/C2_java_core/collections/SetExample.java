package C2_java_core.collections;

import java.util.*;

// 핵심개념: Set은 중복을 허용하지 않음, 순서는 보장되지 않음
public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // 중복 무시됨

        System.out.println("Set 출력: " + fruits);
    }
}
