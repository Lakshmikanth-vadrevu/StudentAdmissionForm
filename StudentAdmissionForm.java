
import java.util.Scanner;

public class StudentAdmissionForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Admission Form");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your date of birth (dd/mm/yyyy):");
        String dob = scanner.nextLine();

        System.out.println("Enter your gender (M/F):");
        String gender = scanner.nextLine();

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        System.out.println("Enter your course:");
        String course = scanner.nextLine();

        System.out.println("Enter your semester:");
        String semester = scanner.nextLine();

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}