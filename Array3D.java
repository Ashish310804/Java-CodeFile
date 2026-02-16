import java.util.Arrays;
public class Array3D {
    public static void main(String[] args) {
        // Declare and initialize a 3D array (2 blocks, each with 2x3 matrix)
        int[][][] numbers = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Print 3D array using nested for loops
        System.out.println("Printing 3D array using nested for loops:");
        for (int i = 0; i < numbers.length; i++) {  // block
            System.out.println("Block " + (i+1) + ":");
            for (int j = 0; j < numbers[i].length; j++) { // row
                for (int k = 0; k < numbers[i][j].length; k++) { // column
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Print 3D array using enhanced for loops
        System.out.println("Printing 3D array using enhanced for loops:");
        int blockNo = 1;
        for (int[][] block : numbers) {
            System.out.println("Block " + blockNo + ":");
            for (int[] row : block) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
            blockNo++;
        }

        // Print 3D array using Arrays.deepToString()
        System.out.println("Printing 3D array using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(numbers));
    }
}
