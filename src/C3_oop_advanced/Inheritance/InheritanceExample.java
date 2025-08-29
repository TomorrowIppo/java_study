package C3_oop_advanced.Inheritance;

// 상속(Inheritance): 부모 클래스의 기능을 자식 클래스가 물려받아 확장 가능
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { // 메서드 오버라이딩 (Overriding)
        System.out.println("Woof! Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Dog(); // 업캐스팅
        a.makeSound(); // 다형성 → "Woof! Woof!" 출력
    }
}
