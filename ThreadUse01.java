public class ThreadUse01 {
    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException! ");
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
