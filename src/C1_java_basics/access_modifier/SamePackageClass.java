package C1_java_basics.access_modifier;

public class SamePackageClass {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.show();
        System.out.println("Public: " + demo.publicNum);
// System.out.println("Private: " + demo.privateNum); // 오류 발생
        System.out.println("Protected: " + demo.protectedNum);
    }
}
