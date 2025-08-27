package C4_design_patterns.behavioral.Observer;

// Subject.java
import java.util.*;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o); }
    public void notifyObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}
