public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " "); // Print the current number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
