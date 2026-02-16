public class WordCount {
    public static void main(String[] args) {
        String t = "Java is fun and Java is powerful";
        t = t.toLowerCase();
        for (char ch='a'; ch<='z'; ch++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (ch==t.charAt(j)) {
                    count++;                                                                                                                
                }
            }
            System.out.println(ch + " = " + count);
        }
    }
}