package lab20.ex3;

import java.util.Arrays;
import java.util.List;

public class Main<T> {

    private List<T> list;

    public Main(T[] array) {
        this.list = Arrays.asList(array);
    }

    public void print5() {
        if (list.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
