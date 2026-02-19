public class SwapProblem {
   public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";
        // Ensure both strings are at least 2 characters long
        if (str1.length() < 2 || str2.length() < 2) {
            System.out.println("Both strings must have at least two characters.");
            return;
        }

        // Swap the first two characters
        String newStr1 = str2.substring(0, 2) + str1.substring(2);
        String newStr2 = str1.substring(0, 2) + str2.substring(2);

        // Combine the strings
        String result = newStr1 + " " + newStr2;

        // Output the result
        System.out.println("Result: " + result);
    }
}

