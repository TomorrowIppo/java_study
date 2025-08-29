package C1_java_basics.oop_intro;

class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

public class PolymorphismIntro {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();   // 다형성 파트
    }
}