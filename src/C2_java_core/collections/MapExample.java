package C2_java_core.collections;

import java.util.*;

// 핵심개념: Map은 Key-Value 구조, Key는 중복 불가
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(2, "Charlie"); // 동일 Key → Value 덮어쓰기

        System.out.println("Map 출력: " + students);
        System.out.println("Key 1의 Value: " + students.get(1));
    }
}
