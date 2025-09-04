package Modifiers;
// Base class
class Employee {
    public int employeeID;        // Public → accessible everywhere
    protected String department;  // Protected → accessible in subclasses and same package
    private double salary;        // Private → only within Employee

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary (since salary is private)
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Display employee info
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        // Can access employeeID (public) and department (protected)
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        // Cannot access salary directly (private) → must use getter
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}

// Test Class
public class EmployeeSystem {
    public static void main(String[] args) {
        Manager mgr = new Manager(2001, "IT", 75000, 10);

        mgr.displayEmployeeInfo();  // from base class
        mgr.displayManagerInfo();   // from subclass

        // Update salary using public setter
        mgr.setSalary(80000);
        System.out.println("Updated Salary (via getter): " + mgr.getSalary());
    }
}

