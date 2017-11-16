package util.adt;

public class Pair<S, T> {

    private S key;
    private T value;

    private Pair(S key, T value) {
        this.key = key;
        this.value = value;
    }

    public static <S, T> Pair of(S key, T value) {
        return new Pair<S, T>(key, value);
    }

    public S getKey() {
        return key;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
