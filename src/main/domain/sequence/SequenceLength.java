package main.domain.sequence;

public class SequenceLength {
    private final int value;

    public SequenceLength(int value) {
        this.value = value;
    }

    public SequenceRowSize calculateRowSize(SequenceColumnSize columnSize) {
        return new SequenceRowSize(value / columnSize.intValue());
    }

    public int intValue() {
        return value;
    }
}
