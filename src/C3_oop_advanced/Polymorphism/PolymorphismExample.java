package C3_oop_advanced.Polymorphism;

// 다형성: 같은 메서드 호출 → 객체 타입에 따라 다르게 동작
class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        super.work();
        System.out.println("Developer is coding...");
    }
}

class Designer extends Employee {
    @Override
    void work() {
        System.out.println("Designer is designing...");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Employee[] employees = { new Developer(), new Designer() };
        for (Employee e : employees) {
            e.work(); // 같은 work()지만 다르게 동작
        }
    }
}

