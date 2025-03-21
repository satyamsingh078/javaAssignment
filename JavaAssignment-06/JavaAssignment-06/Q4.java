public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        char startChar = 'A'; // Starting character

        for (int i = rows; i >= 1; i--) {
            char currentChar = startChar;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(currentChar + " "); 
                currentChar++; 
            }
            System.out.println(); 
        }
    }
}
