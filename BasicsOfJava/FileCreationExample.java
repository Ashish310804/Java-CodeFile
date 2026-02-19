import java.io.IOException;
import java.io.File;
public class FileCreationExample {
    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt");
            //Using BufferedWriter to create a new file
            //BuffredWriter writer = new BufferedWriter(new FileWriter("newfile.txt", true));
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}



