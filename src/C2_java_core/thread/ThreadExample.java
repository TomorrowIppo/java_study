package C2_java_core.thread;

// 핵심개념: Thread 클래스를 상속받아 run() 오버라이드
class MyThread extends Thread {
    @Override
    public void run() {
        // 실제 스레드에서 동작할 코드
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // 새로운 스레드 실행 (run()이 자동 호출됨)

        // main 스레드에서도 동시에 동작
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
