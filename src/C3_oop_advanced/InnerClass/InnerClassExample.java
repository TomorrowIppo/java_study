package C3_oop_advanced.InnerClass;

// 내부 클래스: 클래스 안에 정의되는 클래스
// 익명 클래스: 일회성 구현에 사용
class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void printMessage() {
            System.out.println(message); // Outer 접근 가능
        }
    }
}

interface ButtonClickListener {
    void onClick();
}

public class InnerClassExample {
    public static void main(String[] args) {
        // 내부 클래스 사용
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printMessage();

        // 익명 클래스 사용
        ButtonClickListener btn = new ButtonClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        };
        btn.onClick();
    }
}

