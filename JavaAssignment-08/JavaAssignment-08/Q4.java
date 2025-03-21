class Shape {
    double printArea(double length, double width) {
        return length * width;
    }
    double printArea(double radius) {
        return Math.PI * radius * radius;
    }
    double printArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
