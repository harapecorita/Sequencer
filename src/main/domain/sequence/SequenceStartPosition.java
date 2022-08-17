package main.domain.sequence;

import main.domain.type.Position;

public class SequenceStartPosition {
    private final Position value;

    public SequenceStartPosition(Position value) {
        this.value = value;
    }

    public Position positionValue() {
        return value;
    }
}
