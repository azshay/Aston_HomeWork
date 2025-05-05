import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        String[] lines = new String[]{"Line1", "Line2", "Line3", "Line4"};

        try {
            writeToFile(fileName, lines);
        } catch (MyIOException e) {
            e.printStackTrace();
        }

        try {
            readFile(fileName);
        } catch (MyIOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String[] lines) throws MyIOException {
        for (String line : lines) {
            try {
                Files.writeString(Path.of(fileName), line + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new MyIOException();
            }
        }
    }

    public static void readFile(String fileName) throws MyIOException {
        try {
            String lines = Files.readString(Path.of(fileName));
            System.out.println(lines);
        } catch (IOException e) {
            throw new MyIOException();
        }
    }
}