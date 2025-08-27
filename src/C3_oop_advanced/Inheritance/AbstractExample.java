package C3_oop_advanced.Inheritance;

// 추상 클래스: 공통적인 틀을 제공하고, 세부 구현은 하위 클래스가 담당
abstract class Shape {
    abstract double area(); // 추상 메서드
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape s = new Circle(5); // 추상 클래스는 직접 생성 불가
        System.out.println("Circle area = " + s.area());
    }
}
