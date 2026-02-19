import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class BufferedWriterExm {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to write to the file:");
            String str = sc.nextLine();
            bw.write(str);
            bw.newLine();
            bw.close();
            sc.close();
            System.out.println("File written successfully.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
