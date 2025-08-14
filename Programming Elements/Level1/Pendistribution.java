public class Pendistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = totalPens / totalStudents; // Division
        int remainingPens = totalPens % totalStudents;  // Modulus

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
