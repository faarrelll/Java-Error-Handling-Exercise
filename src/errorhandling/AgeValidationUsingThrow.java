package errorhandling;

public class AgeValidationUsingThrow {
    public static void main(String[] args) {
        int age = -5;

        if (age < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
    }
}
