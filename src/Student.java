//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Ученик: " + name + ", Возраст: " + age + ", Оценка: " + grade);
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
}
