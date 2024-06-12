import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file to separate lines on the console.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".

        Path filePath = Paths.get("C:/Users/renev/Desktop/ABC/ReneVajda1/My notes/FileManipulation1/src/File.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }



    }
}
