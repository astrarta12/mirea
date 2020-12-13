package lab19.ex2;

import lab14.ex3.Student;

import java.util.List;

public class Students {
    public static boolean Search(List<Student> s, String name) {
        for (Student s1 : s) {
            if (s1.compareTo(name)) {
                return true;
            }
        }
        return false;
    }
}