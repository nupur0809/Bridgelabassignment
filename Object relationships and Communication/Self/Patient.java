import java.util.ArrayList;

// Patient class
class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void consultDoctor(Doctor d) {
        if (!doctors.contains(d)) doctors.add(d);
        d.addPatient(this); // maintain two-way association
    }

    void showDoctors() {
        System.out.print("Patient " + name + " consults: ");
        for (Doctor d : doctors) System.out.print(d.name + " ");
        System.out.println();
    }
}

// Doctor class
class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void addPatient(Patient p) {
        if (!patients.contains(p)) patients.add(p);
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
        consultHistory(p);
    }

    void consultHistory(Patient p) {
        System.out.println("Patient " + p.name + " has consulted with Dr. " + name);
    }

    void showPatients() {
        System.out.print("Doctor " + name + " has patients: ");
        for (Patient p : patients) System.out.print(p.name + " ");
        System.out.println();
    }
}

// Hospital class
class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class Problem6 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Johnson");

        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Establish consultations
        pat1.consultDoctor(doc1);
        pat1.consultDoctor(doc2);
        pat2.consultDoctor(doc1);

        // Doctors consult patients
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        // Show associations
        doc1.showPatients();
        doc2.showPatients();
        pat1.showDoctors();
        pat2.showDoctors();
    }
}
