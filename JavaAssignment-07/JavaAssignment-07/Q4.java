import java.util.Scanner; 

class Sphere {
    double radius; 

   
    public void inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();
   
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// Class Calc to compute and display the results
class Calc {
    public static void main(String[] args) {
        Sphere s = new Sphere(); // Create Sphere object

        s.inputValue(); // Call inputValue() to take radius input

        double volume = s.volume(); // Calculate volume
        double area = s.area(); // Calculate surface area

        // Display results
        System.out.println("Volume of Sphere: " + volume);
        System.out.println("Surface Area of Sphere: " + area);
    }
}
