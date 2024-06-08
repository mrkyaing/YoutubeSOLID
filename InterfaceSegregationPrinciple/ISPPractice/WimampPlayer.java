package ISPPractice;


public class WimampPlayer extends Player implements IAudioMediaPlayer {
    public WimampPlayer(String name, String version) {
        super(name, version);
    }

    @Override
    public void playAudio() {
        System.out.println(super.getName()+"Playing audio....");
    }
}
