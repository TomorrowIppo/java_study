package C2_java_core.thread;

// 핵심개념: 스레드를 직접 생성/관리 → 비효율적
// 해결법: ExecutorService 활용 (스레드 풀 관리)

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 스레드 3개 고정 풀

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // 실행 종료
    }
}
