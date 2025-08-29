package C2_java_core.thread;

// 핵심개념: Runnable은 결과 반환 불가 → Callable + Future 조합 사용
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) sum += i;
            return sum;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result from thread: " + future.get()); // Future.get() → 결과 반환

        executor.shutdown();
    }
}
