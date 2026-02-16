import java.io.*;
public class CheckedException {
    public static void main(String[] args) throws IOException {
        /*
        System.out.println("---------------IOException Example---------------");
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(buf.readLine());
        }
        catch (IOException ioe) {
            System.out.println("Caught a checked exception: ");
        }
        finally {
            System.out.println("Execution completed.");
        }
        */



        System.out.println("---------------FileNotFoundException Example---------------");
        try {
            FileReader fr = new FileReader("non_existent_file.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("Read line: " + line);
            br.close();
            fr.close();
        } 
        catch (FileNotFoundException fnfe) {
            System.out.println("Caught a checked exception.");
        } 
        catch (IOException ioe) {
            System.out.println("Caught a checked exception.");
        }
        finally {
            System.out.println("Execution completed.");
        }


        System.out.println("---------------ClassNotFoundException Example---------------");
        try {
            Class.forName("com.nonexistent.ClassName");
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Caught a checked exception.");
        }
        finally {
            System.out.println("Execution completed.");
        }


        System.out.println("---------------InterruptedException Example---------------");
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ie) {
            System.out.println("Caught a checked exception.");
        }
        finally {
            System.out.println("Execution completed.");
        }


        System.out.println("---------------SQLException Example---------------");
        try {
            throw new java.sql.SQLException("Simulated database error");
        } 
        catch (java.sql.SQLException sqle) {
            System.out.println("Caught a checked exception.");
        }
        finally {
            System.out.println("Execution completed.");
        }



        /*
        System.out.println("---------------CloneNotSupportedException Example---------------");
        try {
            Object obj = new Object();
            Object clonedObj = obj.clone();
        } 
        catch (CloneNotSupportedException cnse) {
            System.out.println("Caught a checked exception: "+cnse);
        }
        finally {
            System.out.println("Execution completed.");
        }   
        */
        
        

        System.out.println("---------------NoSuchMethodException Example---------------");
        try {
            Class<?> cls = Class.forName("java.lang.String");
            cls.getMethod("nonExistentMethod");
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Caught a checked exception!");
        }
        catch (NoSuchMethodException nsme) {
            System.out.println("Caught a checked exception");
        }
        finally {
            System.out.println("Execution completed.");
        }

        
    }
}
