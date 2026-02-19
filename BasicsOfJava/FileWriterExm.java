import java.io.FileWriter;
public class FileWriterExm {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
