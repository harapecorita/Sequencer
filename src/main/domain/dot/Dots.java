package main.domain.dot;

import main.domain.image.Image;
import main.domain.sequence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Dots {
    private final List<Dot> value;

    public final static Dots empty = new Dots(new ArrayList<>());

    public void forEach(Consumer<? super Dot> action) {
        value.forEach(action);
    }

    public Dots(List<Dot> value) {
        this.value = value;
    }

    public static Dots fromImage(Image image) {
        // TODO: imageを使って、ドットたちを生成して詰める
        return new Dots(new ArrayList<>());
    }

    public Dot get(DotIndex index) {
        return value.get(index.intValue());
    }

    public SequenceLength getSequenceLength() {
        return new SequenceLength(value.size());
    }

    public Dots trim(int start, int end) {
        return new Dots(value.subList(start, end));
    }

    public Sequence buildDefaultSequence() {
        return Sequence.defaultValue(
                trim(0, 16)
        );
    }
}
