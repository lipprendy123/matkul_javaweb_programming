import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Method untuk menambahkan student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");  // Perbaikan pada println
    }

    // Method untuk menampilkan daftar student
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");  // Perbaikan pada println
            return;
        }
        students.forEach(System.out::println);  // Menampilkan daftar students
    }
}
