import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Студент добавлен:");
        student.displayInfo();
    }

    public void removeStudentByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getName(), name)) {
                System.out.println("Студент удален");
                students.remove(i);
                return;
            }
        }
    }

    public void findStudentByName(String name) {
        for (Student student : students) {
            if (Objects.equals(student.getName(), name)) {
                System.out.println("Найден студент:");
                student.displayInfo();
                return;
            }
        }
    }

    public double calculateAverageGrade() {
        double total = 0.0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total / students.size();
    }
}
