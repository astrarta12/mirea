package lab15.ex3;

import lab13.ex1.Student;
import lab15.ex1.ListTest;

public class ArrayListTest extends ListTest<lab15.ex3.ArrayList<Student>> {

    public ArrayListTest() {
        super(lab15.ex3.ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }
}
