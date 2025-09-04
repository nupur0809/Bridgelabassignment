package Constructor;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0; // example rate per day

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total: " + calculateCost());
    }
}
