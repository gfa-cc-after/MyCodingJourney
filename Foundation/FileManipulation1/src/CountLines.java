import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class CountLines {
    public static int countLines(String filename) {
        try {
            long lineCount = Files.lines(Paths.get(filename)).count();
            return (int) lineCount;
        } catch (IOException e) {
            // Handle the exception by printing an error message
            System.err.println("Error reading the file: " + e.getMessage());
            return 0; // Return 0 if there's an error reading the file
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String filename = "File.txt"; // Replace with the actual file name
        int lines = countLines(filename);
        System.out.println("Number of lines in the file: " + lines);
    }
}
