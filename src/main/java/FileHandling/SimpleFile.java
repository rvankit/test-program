package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFile {
    public static void main(String[] args) throws IOException {
        File file =new File("text.txt");
        file.createNewFile();
        System.out.println("File is created");
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write("Enter the text that you want to write");
        writer.flush();
        writer.close();
        System.out.println("Data is entered into file");
    }
}