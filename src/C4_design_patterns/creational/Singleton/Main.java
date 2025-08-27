package C4_design_patterns.creational.Singleton;

// Main.java
public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.showMessage();
    }
}
