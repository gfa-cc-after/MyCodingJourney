import java.io.File;

public class DiscFiles {
    public static void main(String[] args) {
        String directoryPath = "C:/";
        listFiles(directoryPath);
    }

    public static void listFiles(String directoryPath) {

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFiles(file.getAbsolutePath());
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}