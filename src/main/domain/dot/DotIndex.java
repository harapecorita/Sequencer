package main.domain.dot;

public class DotIndex {
    private final int value;

    public DotIndex(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static final DotIndex zero = new DotIndex(0);

    public DotIndex increment() {
        return new DotIndex(value + 1);
    }
}
