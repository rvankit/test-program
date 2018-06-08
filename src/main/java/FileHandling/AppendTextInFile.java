package FileHandling;

import java.io.*;

public class AppendTextInFile {
    public static void main(String[] args) throws IOException {
        FileReader fileName= new FileReader("C:\\Users\\ankitsoni\\IdeaProjects\\Test\\target\\test.txt");
        BufferedReader reader = new BufferedReader(fileName);
        String currentLine = reader.readLine();
        while (currentLine != null){
            System.out.println(currentLine);
            currentLine = currentLine.toLowerCase();
            System.out.println(currentLine);
            break;
        }
        AppendTextInFile ATIF = new AppendTextInFile();
        ATIF.writerMethod();
    }
    public void writerMethod() throws IOException {
        FileWriter fileName1 = new FileWriter("C:\\Users\\ankitsoni\\IdeaProjects\\Test\\target\\test.txt");
        BufferedWriter writer = new BufferedWriter(fileName1);
        try {
            writer.write("Soni");
        } catch(Exception e){

        }
        finally {
            fileName1.close();
            writer.close();
        }

    }
}
