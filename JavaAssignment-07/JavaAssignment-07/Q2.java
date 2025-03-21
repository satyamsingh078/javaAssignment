import java.util.Scanner; 

public class Function02{
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;                   // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); 

        System.out.println("Factorial of " + n + " is: " + factorial(n));
        
    }
    
}
