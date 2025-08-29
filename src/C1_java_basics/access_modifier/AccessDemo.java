package C1_java_basics.access_modifier;

public class AccessDemo {
    public int publicNum = 1;
    private int privateNum = 2;
    protected int protectedNum = 3;

    public void show() {
        System.out.println("Public: " + publicNum);
        System.out.println("Private: " + privateNum);
        System.out.println("Protected: " + protectedNum);
    }
}