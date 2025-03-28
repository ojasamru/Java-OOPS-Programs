public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int num = 5 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("This block executes always.");
        }
    }
}