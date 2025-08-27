package C4_design_patterns.behavioral.Observer;

// ConcreteObserver.java
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) { this.name = name; }

    @Override
    public void update(String msg) {
        System.out.println(name + " received update: " + msg);
    }
}