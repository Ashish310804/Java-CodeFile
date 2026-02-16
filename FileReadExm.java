import java.io.BufferedReader;
import java.io.FileReader;
public class FileReadExm {
    public static void main(String[] args) {
        //Using BufferedReader to read a file
        try{
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            /*
             while ((chr=br.read()) != -1) {
                System.out.println((char)chr);
            }
             */
            br.close();
        /*    Using Scanner to read a file
              Scanner sc = new Scanner(new File("example.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
         */
        } catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
