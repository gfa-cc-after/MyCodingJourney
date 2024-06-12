import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Doubled {

    public static void decryptDoubled(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/renev/Desktop/ABC/ReneVajda1/My notes/FileManipulation1/src/File.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Decrypt the line by removing every second character if it makes a sense
                String decryptedLine = decryptLine(line);
                // Write the decrypted line to the output file
                writer.write(decryptedLine);
                writer.newLine(); // Add a newline character after each line
            }

            System.out.println("Decryption successful. Check output.txt for the result.");

        } catch (IOException e) {
            System.err.println("File not found or an error occurred: " + e.getMessage());
        }
    }

    private static String decryptLine(String line) {
        StringBuilder decryptedLine = new StringBuilder();

        // Iterate through the characters in the line, skipping every second character
        for (int i = 0; i < line.length(); i += 2) {
            decryptedLine.append(line.charAt(i));
        }

        return decryptedLine.toString();
    }

    public static void main(String[] args) {
        decryptDoubled("C:/Users/renev/Desktop/ABC/ReneVajda1/My notes/FileManipulation1/src/File.txt");
    }
}
