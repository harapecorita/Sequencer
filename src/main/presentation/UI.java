package main.presentation;

import main.domain.Sequencer;
import main.domain.image.Image;
import main.presentation.audio.Player;

public class UI {
    private Player player;

    public UI() {
        player = new Player();
    }

    public void openSelectImageDialog() {
        // TODO: 新しい画像を取り込むダイアログを表示する
        loadImage(null);
    }

    public void loadImage(Image image) {
        player.setSequencer(Sequencer.fromImage(image));
    }

    public void addDefaultSequence() throws Exception {
        var currentSequencer = player.getSequencer();
        if(currentSequencer == null) {
            throw new Exception("先に画像を選択してください。");
        };
        player.setSequencer(currentSequencer.addSequence(
                currentSequencer.getDots().buildDefaultSequence()
        ));
    }

    public void play() {
        if(player == null) return;
        player.play();
    }

    public void pause() {
        if(player == null) return;
        player.play();
    }

    public void stop() {
        if(player == null) return;
        player.stop();
    }
}
