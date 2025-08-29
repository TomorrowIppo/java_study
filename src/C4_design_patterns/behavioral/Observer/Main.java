package C4_design_patterns.behavioral.Observer;

// Main.java
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer o1 = new ConcreteObserver("Observer1");
        Observer o2 = new ConcreteObserver("Observer2");

        subject.addObserver(o1);
        subject.addObserver(o2);

        subject.notifyObservers("Event Happened!");
    }
}