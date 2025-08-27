package C2_java_core.generics;

// 핵심개념: 제네릭은 타입 안정성을 제공 → 컴파일 타임에 타입 체크
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getItem());
    }
}
