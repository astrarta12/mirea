package lab26.ex1;

public interface Queue<E> {
    void enqueue(E element);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
