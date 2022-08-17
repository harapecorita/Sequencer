package main;

import main.domain.dot.Dot;
import main.domain.dot.Dots;
import main.domain.image.Image;
import main.presentation.UI;

import java.util.List;

public class Main {

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

    void play() {
        var ui = new UI();
        ui.loadImage(new TestImage());
        ui.play();
    }

    public static void main(String... args) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAA");
        var main = new Main();
        main.play();
    }
}
