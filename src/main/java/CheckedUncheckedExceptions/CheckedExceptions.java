package CheckedUncheckedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) {
        readFile("text.txt");

    }

    public static void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }
    }

    // checked exceptions are before compiling need to be handled
}
