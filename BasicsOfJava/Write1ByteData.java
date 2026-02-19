import java.io.FileOutputStream;
public class Write1ByteData {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("byteData.txt");
            fos.write(104);
            fos.close();
            System.out.println("1 Byte data written to file successfully.");
        }
        catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


/*
         //Reading 1 Byte data from file
         try{
            FileInputStream fis = new FileInputStream("byteData.txt");
            int data = fis.read();
            System.out.println("Data read from file: " + (char)data);
            fis.close();
        }
        catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }   
 */
/*
        //Reading multiple Byte data from file
        try{
            FileInputStream fis = new FileInputStream("byteData.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }
            fis.close();
        }
        catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
 */
