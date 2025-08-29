package C1_java_basics.oop_intro;

public class EncapsulationExample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setName("BRUH");
        System.out.println(obj.getName());
    }
}
