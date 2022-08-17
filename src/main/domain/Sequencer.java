package main.domain;

import main.domain.dot.Dots;
import main.domain.image.Image;
import main.domain.sequence.Sequence;
import main.domain.sequence.Sequences;

public class Sequencer {
    private final Dots dots;
    private final Sequences sequences;

    public Dots getCurrentDots() {
        return sequences.getCurrentDots();
    }

    public Sequencer incrementSequences() {
        return new Sequencer(
                dots,
                sequences.incrementAll()
        );
    }

    public Sequencer resetAllIndex() {
        return new Sequencer(
                dots,
                sequences.resetAllIndex()
        );
    }

    public Sequencer(Dots dots, Sequences sequences) {
        this.dots = dots;
        this.sequences = sequences;
    }

    public static Sequencer fromImage(Image image) {
        return new Sequencer(
                image.toDots(),
                Sequences.empty
        );
    }

    public Sequencer addSequence(Sequence sequence) {
        return new Sequencer(
                dots,
                sequences.addSequence(sequence)
        );
    }

    public Dots getDots() {
        return dots;
    }
}
