public class StringOperations {
    public static void main(String[] args) {
        String s = new String("Hello");  //By new keyword
        String s1 = "Welcome!";                     //By string literal


        System.out.println("-------String Concatenation-------");
        System.out.println(s.concat(s1));              //concatenation of two strings
        String str = s + s1;                           //concatenation using +
        System.out.println(str);


        String str2 = new String("Welcome");
        String str3 = "Welcome";  
        String str4 = "Welcome"; 
        String str5 = "Welcomes"; 
        System.out.println("-------String Comparison-------");
        System.out.println(str2 == str3);                        //reference comparison
        System.out.println(str3 == str4);                        
        System.out.println(str2.equals(str3));                   //value comparison
        System.out.println(str3.equals(str4));                   
        System.out.println(str2.compareTo(str3));             //lexicographical comparison
        System.out.println(str3.compareTo(str5));             //lexicographical comparison


        System.out.println("-------String Methods-------");
        System.out.println(s.length());                 //length of string
        System.out.println(s.charAt(3));         //character at index 3
        System.out.println(s.contains("come"));     //check if substring is present
        System.out.println(s.indexOf('e'));          //index of first occurrence of character
        System.out.println(s.lastIndexOf('e'));   //index of last occurrence of character
        System.out.println(s.trim());                  //removes leading and trailing spaces
        System.out.println(s.toUpperCase());          //converts to uppercase
        System.out.println(s.toLowerCase());         //converts to lowercase
        System.out.println(s.startsWith("Wel"));      //check if string starts with substring
        System.out.println(s.endsWith("ome"));       //check if string ends with substring
        System.out.println(s.replace('e','a'));     //replaces all occurrences of a character
        System.out.println(s1.replace("mes","come"));
        System.out.println(s.isEmpty());                           //check if string is empty


        System.out.println("-------Substring Extraction-------");
        System.out.println(s.substring(2,5));           //substring from index 2 to 4
        System.out.println(s1.substring(2));                     //substring from index 2 to end


        System.out.println("-------String Mutability-------");
        String str8 = new String("Dev Bhoomi Uttrakhand University");
        System.out.println(str8);
        /*
        sb = new StringBuffer(str8);
        sb.append("Dehradun");                           //modifying string using StringBuffer and is not thread safe
        System.out.println(sb);
         */
        /* 
        sb = new StringBuilder(str8);
        sb.append("Dehradun");                           //modifying string using StringBuilder and for single thread
        System.out.println(sb);
        */
    }
}
