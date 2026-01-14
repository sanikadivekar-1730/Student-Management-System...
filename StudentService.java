import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    // View Students
    void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Student Found!");
            return;
        }

        System.out.println("ID\tName\tMarks");
        for (Student s : students) {
            s.display();
        }
    }

    // Search Student by ID
    void searchStudent(int id) {
        for (Student s : students) {
            if (s.getid() == id) {
                System.out.println("Student Found");
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    // Delete Student by ID
    void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getid() == id) {
                students.remove(s);
                System.out.println("Student Data Deleted");
                return;
            }
        }
        System.out.println("Student Not Found");
    }
}
