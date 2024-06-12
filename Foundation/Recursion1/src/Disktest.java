import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Disktest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testListFiles() {
        String directoryPath = "C:/"; // Change this to a valid directory path on your system
        DiscFiles.listFiles(directoryPath);
        String[] expectedFiles = { "C:\\Users\\renev\\Desktop\\G\\Gothic2Coop\\System\\Gothic2.exe"
                // Add expected file paths here manually or dynamically based on your directory structure
                // For example: "C:/exampleFile.txt", "C:/exampleDirectory/exampleSubdirectory/exampleFile.txt"
        };
        String[] actualFiles = outContent.toString().split(System.lineSeparator());

        // Assert that all expected files are found in the output
        for (String expectedFile : expectedFiles) {
            assertTrue("File not found: " + expectedFile, containsFile(actualFiles, expectedFile));
        }

        // Assert that the number of listed files matches the expected number
        assertEquals("Number of listed files is incorrect", expectedFiles.length, actualFiles.length);
    }

    private boolean containsFile(String[] files, String file) {
        for (String f : files) {
            if (f.equals(file)) {
                return true;
            }
        }
        return false;
    }
}
