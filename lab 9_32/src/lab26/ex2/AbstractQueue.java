package lab26.ex2;

public interface AbstractQueue<E> {

    void add(E element);

    E poll();

    boolean isEmpty();

}
