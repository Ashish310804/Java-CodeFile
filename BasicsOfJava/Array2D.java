import java.util.Arrays;
public class Array2D {
    public static void main(String[] args) {
        
        // Declare and initialize a 2D array
        int[][] numbers = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print 2D array using nested for loop
        System.out.println("Printing 2D array using nested for loop:");
        for (int i = 0; i < numbers.length; i++) {         // rows
            for (int j = 0; j < numbers[i].length; j++) {  // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // Print 2D array using enhanced for loop
        System.out.println("\nPrinting 2D array using enhanced for loop:");
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Print 2D array using Arrays.deepToString()
        System.out.println("\nPrinting 2D array using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(numbers));
    }
}
