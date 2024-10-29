package errorhandling;

import jdk.jshell.EvalException;

public class CustomExceptionApp {
    public static void main(String[] args) {
        try {
            validationBalance(-10);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validationBalance(int i){
        if (i < 0){
            throw new CustomException("Jumlah penarikan tidak boleh negatif");
        }
    }
}
