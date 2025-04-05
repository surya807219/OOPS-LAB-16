import java.io.*;

public class FileExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
