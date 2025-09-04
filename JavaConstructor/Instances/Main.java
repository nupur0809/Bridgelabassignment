package Instances;

public class Main {
    public static void main(String[] args) {
        // Problem 1: Product
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 30000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println();

        // Problem 2: Course
        Course.updateInstituteName("Tech Academy"); // update for all courses
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println();

        // Problem 3: Vehicle
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000); // update for all
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
