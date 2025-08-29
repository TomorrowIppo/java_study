package C3_oop_advanced.Inheritance;

// 인터페이스: 다중 상속 가능, 표준(계약) 역할
interface Flyable {
    void fly(); // 암묵적으로 public abstract
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying...");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}