package LSPPractice;

public class PremiumVideo {
    private int premiumId;
   private  VideoManager videoManager;

    public PremiumVideo(VideoManager videoManager,int premiumId) {
        this.premiumId = premiumId;
        this.videoManager = videoManager;
    }

    public void downloadWithHDFormat() {
        System.out.println("downloading with HD 4K Quality.");
    }
    public double getNumberofHoursPlayed(){
        return videoManager.getNumberofHoursPlayed();
    }
    @Override
    public String toString() {
        return "PremiumVideo{" +
                "premiumId=" + premiumId +
                '}' + videoManager;
    }
}
