public class Pattern3 {
    public static void main(String[] args) {
        int size = 5; // height of roof
        // Roof (triangle)
        for (int i = 1; i <= size; i++) {
            // spaces
            for (int j = i; j < size; j++) {
                System.out.print("  ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Walls (rectangle)
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (2 * size - 1); j++) {
                if (j == 1 || j == (2 * size - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
