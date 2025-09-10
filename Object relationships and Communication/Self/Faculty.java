import java.util.ArrayList;

// Faculty class (can exist independently)
class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

// Department class (part of University, composition)
class Department {
    String name;
    ArrayList<Faculty> faculties = new ArrayList<>();
    Department(String name) { this.name = name; }

    void addFaculty(Faculty f) { faculties.add(f); }

    void showFaculties() {
        System.out.print("Department " + name + " has faculties: ");
        for (Faculty f : faculties) System.out.print(f.name + " ");
        System.out.println();
    }
}

// University class (owns Departments)
class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    University(String name) { this.name = name; }

    void addDepartment(Department d) { departments.add(d); }

    void showDepartments() {
        System.out.println("University " + name + " has departments:");
        for (Department d : departments) d.showFaculties();
    }
}

// Demo
public class SelfProblem2 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        Department d1 = new Department("Computer Science");
        d1.addFaculty(f1);
        d1.addFaculty(f2);

        Department d2 = new Department("Mathematics");

        University uni = new University("Global University");
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showDepartments();

        // Faculty can exist outside department
        Faculty f3 = new Faculty("Dr. Adams");
        System.out.println("Independent Faculty: " + f3.name);
    }
}
