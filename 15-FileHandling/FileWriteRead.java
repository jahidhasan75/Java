import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteRead {
    public static void main(String[] args) {
        Path path = Path.of("practice.txt");
        try {
            Files.writeString(path, "Hello from Java file handling!");
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
