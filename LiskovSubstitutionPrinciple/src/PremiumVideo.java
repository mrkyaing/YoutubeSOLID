public class PremiumVideo extends Video {
    private int premiumId;

    public PremiumVideo(String title, int time, int likes, int views, int premiumId) {
        super(title, time, likes, views);
        this.premiumId = premiumId;
    }

    @Override
    public void playRandomAds() throws Exception {
        throw new Exception("No Ads play during premium videos");
    }

    public void downloadWithHDFormat() {
        System.out.println("downloading with HD 4K Quality.");
    }

    @Override
    public String toString() {
        return "PremiumVideo{" +
                "premiumId=" + premiumId +
                '}' + super.toString();
    }
}
