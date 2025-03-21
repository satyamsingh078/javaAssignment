public class NestedLoopsPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            char ch = 'A'; // Initialize the character to 'A'
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " "); 
                ch++; 
            }
            System.out.println(); 
        }
    }
}
