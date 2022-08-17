package main.domain.sequence;

import main.domain.dot.Dots;

import java.util.ArrayList;
import java.util.List;

public class Sequences {
    private final List<Sequence> value;

    public Sequences(List<Sequence> value) {
        this.value = value;
    }

    public static final Sequences empty = new Sequences(new ArrayList<>());

    public Dots getCurrentDots() {
        return new Dots(
                value.stream().map(Sequence::getCurrentDot).toList()
        );
    }

    public Sequences incrementAll() {
        return new Sequences(value.stream().map(Sequence::incrementIndex).toList());
    }

    public Sequences resetAllIndex() {
        return new Sequences(value.stream().map(Sequence::incrementIndex).toList());
    }

    public Sequences addSequence(Sequence sequence) {
        var copiedList = List.copyOf(value);
        copiedList.add(sequence);
        return new Sequences(copiedList);
    }
}
