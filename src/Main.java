import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            StudentManager manager = new StudentManager();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nВыберите варинат:");
                System.out.println("1. Добавить студента");
                System.out.println("2. Удалить студента по имени");
                System.out.println("3. Найти студента по имени");
                System.out.println("4. Рассчитать средний балл");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите возраст: ");
                        int age = scanner.nextInt();
                        System.out.print("Введите оценку: ");
                        double grade = scanner.nextDouble();
                        manager.addStudent(new Student(name, age, grade));
                        break;
                    case 2:
                        System.out.print("Введите имя студента для удаления: ");
                        String removeName = scanner.nextLine();
                        manager.removeStudentByName(removeName);
                        break;
                    case 3:
                        System.out.print("Введите имя студента для поиска: ");
                        String findName = scanner.nextLine();
                        manager.findStudentByName(findName);
                        break;
                    case 4:
                        double averageGrade = manager.calculateAverageGrade();
                        System.out.println("Средний балл:"+ averageGrade);
                        break;
                }
            }

    }
}