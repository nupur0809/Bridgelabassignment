import java.util.ArrayList;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String name) { this.name = name; }
    void addEmployee(Employee e) { employees.add(e); }
    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) System.out.println("Employee: " + e.name);
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void showDepartments() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showEmployees();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        d2.addEmployee(new Employee("Charlie"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showDepartments();
        // If company is deleted, departments and employees are gone (composition)
    }
}
