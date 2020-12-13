package lab13.ex1;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Archi", 20),
                new Student(2, "Barry", 19),
                new Student(1, "Clay", 19)
        };
        Arrays.sort(students, Comparator.comparingInt(Student::getIDNumber));
        for (var student : students) {
            System.out.println(student.toString());
        }
    }
}