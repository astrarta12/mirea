package lab13.ex2;
import lab13.ex1.Student;

public class Main {
    public static void main(String []args) {
        Student[] students = {
                new Student(3, "Mikky", 20, new double[] {5, 4, 5}),
                new Student(2, "Blaze", 19, new double[] {2, 4, 2}),
                new Student(1, "Kelly", 19, new double[] {5, 3, 3})

        };
        lab13.ex2.SortingStudentsByGPA srt = new lab13.ex2.SortingStudentsByGPA();
        srt.sort(students);
    }
}
