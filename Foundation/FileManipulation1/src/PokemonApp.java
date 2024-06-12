import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PokemonApp {
    public static void main(String[] args) {

    List<String> pokemon = readFile("C:/Users/renev/Desktop/ABC/ReneVajda1/My notes/FileManipulation1/src/File.txt");
        System.out.println(pokemon);

    }


    public static List<String> readFile(String file) {
        Path filePath = Paths.get(file);

        try {
            List<String> fileLines = Files.readAllLines(filePath);

            return fileLines;

        } catch (IOException e) {
            System.err.println("Unable to read file");
            return new ArrayList<>();
        }
    }





}
