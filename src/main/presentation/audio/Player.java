package main.presentation.audio;

import main.domain.Sequencer;

public class Player {
    private Sequencer sequencer;
    private boolean isStopped = false;

    public Player() {}

    public void setSequencer(Sequencer sequencer){
        this.sequencer = sequencer;
    }

    public void play() {
        isStopped = true;
        if(sequencer == null) return;
        while (!isStopped) {
            // TODO: BPMに応じてdelayする
            var currentDots = sequencer.getCurrentDots();
            // TODO: currentDotsを鳴らす.ここではコンソールに出力する
            currentDots.forEach(System.out::println);
            sequencer = sequencer.incrementSequences();
        }
    }

    public void pause() {
        isStopped = true;
    }

    public void stop() {
        if(sequencer == null) return;
        isStopped = true;
        sequencer.resetAllIndex();
    }

    public Sequencer getSequencer() {
        return sequencer;
    }
}
