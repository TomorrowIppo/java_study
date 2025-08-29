package C2_java_core.thread;

// 핵심개념: 멀티스레드 환경에서 공유 자원 동시 접근 → 데이터 불일치 발생
// 해결법: synchronized 키워드 사용

class Counter {
    private int count = 0;

    // 동기화된 메서드
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // 스레드 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // 스레드 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join(); // 스레드 종료까지 대기
        t2.join();

        System.out.println("Final count = " + counter.getCount());
    }
}
