import java.util.Scanner; 

class Geometry {

    public static double calc_circle_area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calc_rectangle_area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + calc_circle_area(radius));

        // Input for rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + calc_rectangle_area(length, width));

        scanner.close();
    }
}

