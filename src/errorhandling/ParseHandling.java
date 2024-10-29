package errorhandling;

public class ParseHandling {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("input bukan angka");
        }
    }
}
