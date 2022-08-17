package main.domain.sequence;

import main.domain.dot.Dot;
import main.domain.dot.Dots;

public class Sequence {
    private final SequenceType type;
    private final SequenceColumnSize columnSize;
    private final Dots dots;
    private final SequenceIndex currentIndex;

    public Sequence(
            SequenceType type,
            SequenceColumnSize columnSize,
            Dots dots,
            SequenceIndex currentIndex
    ) {
        this.type = type;
        this.columnSize = columnSize;
        this.dots = dots;
        this.currentIndex = currentIndex;
    }

    public SequenceRowSize getRowSize() {
        return dots.getSequenceLength().calculateRowSize(columnSize);
    }

    public Dot getCurrentDot() {
        return dots.get(currentIndex.toDotIndex(dots.getSequenceLength()));
    }

    public Sequence incrementIndex() {
        return new Sequence(
                type,
                columnSize,
                dots,
                currentIndex.increment()
        );
    }

    public Sequence resetIndex() {
        return new Sequence(
                type,
                columnSize,
                dots,
                SequenceIndex.zero
        );
    }

    public static Sequence defaultValue(Dots dots) {
        return  new Sequence(
                SequenceType.Block,
                new SequenceColumnSize(4),
                dots,
                SequenceIndex.zero
        );
    }
}
