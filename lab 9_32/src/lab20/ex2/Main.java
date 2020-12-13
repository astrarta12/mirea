package lab20.ex2;

public class Main<T> {

    private T[] array;

    public Main(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }
}
