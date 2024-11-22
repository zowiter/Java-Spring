import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Эвелина", "534", 2, new int[]{5, 4, 4, 5, 5}));
        students.add(new Student("Сергей", "531", 2, new int[]{5, 3, 4, 5, 5}));
        students.add(new Student("Александр", "435", 3, new int[]{2, 3, 2, 2, 3}));
        students.add(new Student("Павел", "235", 4, new int[]{4, 3, 2, 2, 5}));
        updateStudents(students);
        System.out.println();
        printStudents(students, 3);
    }

    private static void updateStudents(List<Student> students) {
        int i = 0;
        while(i < students.size()) {
            int nextCourse = students.get(i).getCourse() + 1;
            if(students.get(i).calculateAvg() < (double) 3) {
                System.out.println("Студент " + students.get(i).getName() + " отчислен!");
                students.remove(i);
            } else if(nextCourse < 4) { // Проверка явялется ли курс выпусным (выпускной курс - 4)
                students.get(i).setCourse(nextCourse);
                System.out.println("Студент " + students.get(i).getName() + " переведен на следующий курс: " + students.get(i).getCourse());
                i++;
            } else {
                System.out.println("Студент " + students.get(i).getName() + " выпустился!");
                i++;
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на курсе " + course + ":");
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }
}
