package errorhandling;

public class DivisionByZero {
    public static void main(String[] args) {

        try {
            int i = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi 0");
        }
    }
}
