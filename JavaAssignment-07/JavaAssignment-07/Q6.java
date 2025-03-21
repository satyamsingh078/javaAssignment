import java.util.Scanner; 

class StudentPerformance {
    
    public static double computeAverage(double marks1, double marks2, double marks3) {
        return (marks1 + marks2 + marks3) / 3;
    }

    // Function to check if the student has passed or failed
    public static String determineResult(double averageMarks) {
        return (averageMarks >= 50) ? "Passed" : "Failed";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter marks for Subject 1: ");
        double subject1Marks = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2Marks = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3Marks = scanner.nextDouble();

        // Calculate the average marks
        double averageMarks = computeAverage(subject1Marks, subject2Marks, subject3Marks);
        
        String finalResult = determineResult(averageMarks);

        System.out.println("\nAverage Marks: " + averageMarks);
        System.out.println("Result: " + finalResult);

    }
}
