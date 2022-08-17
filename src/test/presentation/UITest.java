package test.presentation;

import main.domain.dot.Dot;
import main.domain.dot.Dots;
import main.domain.image.Image;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UITest {

    class TestImage extends Image {
        public TestImage() {
            super(null);
        }

        @Override
        public Dots toDots() {
            var dotList = List.of(
                    new Dot(255, 255, 255),
                    new Dot(0, 0, 0),
                    new Dot(1,1,1),
                    new Dot(2,2,2)
            );
            return new Dots(dotList);
        }
    }

    @Test
    void play() {
        var ui = new main.presentation.UI();
        ui.loadImage(new TestImage());
        ui.play();
    }
}