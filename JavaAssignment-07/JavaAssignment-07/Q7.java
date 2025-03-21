import java.util.Scanner;

class NumberOperations {

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    // Function to find sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is even or odd
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // Function to check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Choose an option:");
        System.out.println("1. Reverse a number");
        System.out.println("2. Addition of digits");
        System.out.println("3. Check even or odd");
        System.out.println("4. Check perfect number");
        System.out.println("5. Check palindrome");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Switch-case for different operations
        switch (choice) {
            case 1:
                System.out.println("Reversed Number: " + reverseNumber(num));
                break;
            case 2:
                System.out.println("Sum of Digits: " + sumOfDigits(num));
                break;
            case 3:
                System.out.println("The number is " + checkEvenOdd(num));
                break;
            case 4:
                System.out.println(num + (isPerfectNumber(num) ? " is a Perfect Number." : " is not a Perfect Number."));
                break;
            case 5:
                System.out.println(num + (isPalindrome(num) ? " is a Palindrome." : " is not a Palindrome."));
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }

        scanner.close();
    }
}
