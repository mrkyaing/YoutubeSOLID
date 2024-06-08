package LSPPractice;

public class Video {
    private VideoManager videoManager;

    public Video(VideoManager videoManager) {
        this.videoManager = videoManager;
    }

    public double getNumberofHoursPlayed(){
        return videoManager.getNumberofHoursPlayed();
    }
    public void playRandomAds(){
        videoManager.playRandomAds();
    }

    @Override
    public String toString() {
        return videoManager.toString();
    }
}
