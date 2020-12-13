package lab15.ex2;

import lab13.ex1.Student;
import lab15.ex1.ListTest;

import java.util.LinkedList;

public class Main extends ListTest<LinkedList<Student>> {

    public Main() {
        super(LinkedList::new);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
