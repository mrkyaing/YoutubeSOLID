package ISPPractice;


public class VlcPlayer extends Player implements IVideoMediaPalyer {

    public VlcPlayer(String name, String version) {
        super(name, version);
    }

    @Override
    public void playVideo() {
        System.out.println(super.getName()+"Playing video....");
    }

    @Override
    public void playAudio() {
        System.out.println(super.getName()+"Playing audio....");
    }
}
