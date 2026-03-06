public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Full Multiplication Table (1 to 10):");
        printFullMultiplicationTable();

        System.out.println();

        System.out.println("Diagonal Values (1×1, 2×2, ..., 10×10):");
        printDiagonalValues();
    }

    // Method to print the full multiplication table (1 to 10)
    public static void printFullMultiplicationTable() {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.print((row * column) + "\t");
            }
            System.out.println();
        }
    }

    // Method to print only diagonal values using a while loop
    public static void printDiagonalValues() {
        int num = 1;
        while (num <= 10) {
            // Diagonal values are squares (1×1, 2×2, ..., 10×10)
            System.out.println(num + " × " + num + " = " + (num * num));
            num++;
        }
    }
}
