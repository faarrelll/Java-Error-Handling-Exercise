package errorhandling;

public class CheckNullPointer {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Object adalah null");
        }
    }
}
