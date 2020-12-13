package lab15.ex1;


import lab13.ex1.Student;

import java.util.List;
import java.util.function.Supplier;

public class ListTest<T extends List<Student>> {

    private Supplier<T> supplier;

    public ListTest(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public void run() {
        test1();
        test2();
        test3();
    }

    public void test1() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        assert list.size() == 100;
    }

    public void test2() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        for (int i = 0; i < 100; i++) {
            list.remove(0);
        }
        assert list.size() == 0;
    }

    public void test3() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        for (int i = 0; i < 100; i++) {
            assert list.get(i).getIDNumber() == i;
        }
    }
}
