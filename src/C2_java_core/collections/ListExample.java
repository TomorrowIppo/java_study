package C2_java_core.collections;

import java.util.*;

// 핵심개념: List는 순서가 있는 컬렉션, 중복 허용
public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // 중복 허용

        System.out.println("List 출력: " + fruits);

        // 인덱스로 접근 가능
        System.out.println("첫 번째 요소: " + fruits.get(0));
    }
}

