package lab19.ex2;

import lab14.ex3.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Students{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add( new Student( "Archy", 1,20, 4.5));
        students.add(new Student( "Barry", 2, 19, 3.6));
        students.add(new Student("Clay", 3, 19, 5));


        Student[] st = students.toArray(new Student[0]);
        for (Student s: st) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            if (Search(students, name)) {
                System.out.println("Found");
            } else {
                throw (new Exception());
            }
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}