import java.util.Scanner; 

public class Function01 {
    public static int addNumbers(int a, int b) {
        return a + b; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); 

        sc.close(); 

        int sum = addNumbers(num1, num2); 
        System.out.println("Sum: " + sum); 
    }
}
