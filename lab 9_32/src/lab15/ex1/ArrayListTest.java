package lab15.ex1;

import lab13.ex1.Student;

import java.util.ArrayList;

public class ArrayListTest extends lab15.ex1.ListTest<ArrayList<Student>> {

    public ArrayListTest() {
        super(ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }

}
