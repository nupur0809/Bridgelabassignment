package Constructor;
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);  // calls parameterized constructor with default radius
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
