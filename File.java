import java.io.*;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello, File Handling in Java!");
            writer.close();
            System.out.println("File written successfully.");

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            System.out.println("File content: " + reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}