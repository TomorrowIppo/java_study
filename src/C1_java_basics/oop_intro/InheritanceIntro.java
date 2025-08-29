package C1_java_basics.oop_intro;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceIntro {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
