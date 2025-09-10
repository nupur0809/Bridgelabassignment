import java.util.ArrayList;

// Course class
class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) { this.name = name; }

    void enrollStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.print("Course " + name + " has students: ");
        for (Student s : students) System.out.print(s.name + " ");
        System.out.println();
    }
}

// Student class
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) { this.name = name; }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.print("Student " + name + " enrolled in: ");
        for (Course c : courses) System.out.print(c.name + " ");
        System.out.println();
    }
}

// School class (aggregates students)
class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) { this.name = name; }

    void addStudent(Student s) { students.add(s); }

    void showStudents() {
        System.out.println("School " + name + " has students:");
        for (Student s : students) System.out.println(s.name);
    }
}

// Demo
public class SelfProblem1 {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
