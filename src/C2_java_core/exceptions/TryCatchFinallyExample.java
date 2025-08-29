package C2_java_core.exceptions;

// 핵심개념: 예외 처리 구조 → try, catch, finally
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 예외 발생
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("finally 블록은 항상 실행됨");
        }
    }
}
