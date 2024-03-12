package Programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Program2 {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\****\\eclipse-workspace\\Day9";
        String targetFileName = "file.txt"; 

        try {
            Stream<Path> filesStream = Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().equals(targetFileName));

            filesStream.forEach(path -> System.out.println(path.toAbsolutePath()));
        } catch (Exception e) {
            System.out.println("Error occurred while searching for files: " + e.getMessage());
        }
    }
}
