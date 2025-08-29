package C1_java_basics.classes_object;

public class ConstructorExample {
    int value;

    public ConstructorExample(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ConstructorExample ex = new ConstructorExample(10);
        ex.printValue();
    }
}
