// Base class
package Modifiers;
class Student {
    public int rollNumber;       // Public → accessible everywhere
    protected String name;       // Protected → accessible in same package & subclasses
    private double CGPA;         // Private → accessible only within this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify private CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    public void displayPostgradInfo() {
        // Can access rollNumber (public) and name (protected) directly
        System.out.println("Postgraduate Student Roll: " + rollNumber);
        System.out.println("Name (protected): " + name);
        // Cannot access CGPA directly (private in superclass), use getter
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

// Test Class
public class UniversitySystem {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Nupur", 8.9, "AI in Healthcare");

        pg.displayInfo();          // Access base class method
        pg.displayPostgradInfo();  // Access subclass method

        // Modify CGPA using public setter
        pg.setCGPA(9.2);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
