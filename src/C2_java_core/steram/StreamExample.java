package C2_java_core.steram;

import java.util.*;
import java.util.stream.*;

// 핵심개념: Stream은 데이터 처리 파이프라인 (filter, map, collect)
public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A")) // 조건 필터링
                .map(String::toUpperCase)             // 변환
                .collect(Collectors.toList());        // 수집

        System.out.println("Stream 결과: " + result);
    }
}
