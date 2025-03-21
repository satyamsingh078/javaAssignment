import java.util.Scanner; 

public class Function03 {
    
    // Function for Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Function for Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function for Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function for Division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN;              // Return "Not a Number" if division by zero
        }
        return (double) a / b; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

      
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt(); // User selects operation


        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }
    }
}
