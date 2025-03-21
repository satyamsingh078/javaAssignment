public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int currentRow = 1; currentRow <= rows; currentRow++) {
            for (int currentNumber = 1; currentNumber <= currentRow; currentNumber++) {
                System.out.print(currentNumber + " "); /
            }
            System.out.println(); 
        }
    }
}
