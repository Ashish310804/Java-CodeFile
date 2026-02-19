public class Array1D {
    public static void main(String[] args) {
        // Declare and initialize a 1D array
        int[] numbers = new int[]{10, 20, 30, 40, 50};

        // Print array elements using a for loop
        System.out.println("Printing array using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }

        // Print array elements using enhanced for loop
        System.out.println("\nPrinting array using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

