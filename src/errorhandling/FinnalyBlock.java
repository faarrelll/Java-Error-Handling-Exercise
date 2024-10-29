package errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinnalyBlock {
    public static void main(String[] args) {
        File file = new File("/home/enigma/IdeaProjects/Challenge-Error-Handling/src/file.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
