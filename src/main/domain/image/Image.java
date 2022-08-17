package main.domain.image;

import main.domain.dot.Dots;

public class Image {
    private final byte[] value;

    public Image(byte[] value) {
        this.value = value;
    }

    public Dots toDots() {
        return Dots.fromImage(this);
    }
}
