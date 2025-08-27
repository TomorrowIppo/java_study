package C2_java_core.thread;

// 핵심개념: 다중 상속 불가 문제 해결 → Runnable 인터페이스 활용
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable running: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // 람다식 사용 → 코드 간단화
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Lambda running: " + i);
            }
        });
        t2.start();
    }
}