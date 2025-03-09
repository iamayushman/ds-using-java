public class Pair<T1, T2> {

    T1 t1;
    T2 t2;

    public T1 getKey() {
        return t1;
    }

    public T2 getValue() {
        return t2;
    }

    public Pair(T1 first, T2 second) {
        t1 = first;
        t2 = second;
    }
}
