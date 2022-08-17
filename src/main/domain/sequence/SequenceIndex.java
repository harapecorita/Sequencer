package main.domain.sequence;

import main.domain.dot.DotIndex;

public class SequenceIndex {
    private final int value;

    public SequenceIndex(int value) {
        this.value = value;
    }

    public static final SequenceIndex zero = new SequenceIndex(0);

    public SequenceIndex increment() {
        return new SequenceIndex(
                value + 1
        );
    }

    public DotIndex toDotIndex(SequenceLength length) {
        return new DotIndex(value % length.intValue());
    }
}
