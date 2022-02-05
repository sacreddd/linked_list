public interface SimpleCollection<T> {
    int size();

    boolean isEmpty();

    boolean contains(T o);

    T[] toArray(); // optional

    void add(T data);

    void remove(T o);

    void clear();
}