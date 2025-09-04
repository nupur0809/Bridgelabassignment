package Instances;
class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000.0; // default fee for all vehicles

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + " | Vehicle: " + vehicleType + " | Registration Fee: " + registrationFee);
    }

    // Class method (static)
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
