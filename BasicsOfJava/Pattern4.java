public class Pattern4 {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Print trailing spaces (optional for symmetry)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

