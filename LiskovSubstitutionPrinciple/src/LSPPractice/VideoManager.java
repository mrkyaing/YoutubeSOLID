package LSPPractice;

public class VideoManager {
    private String title;
    private int time,likes,views;

    public VideoManager(String title, int time, int likes, int views) {
        this.title = title;
        this.time = time;
        this.likes = likes;
        this.views = views;
    }
    public double getNumberofHoursPlayed(){
        return (time/3600.00)*views;
    }

    public void playRandomAds(){
        System.out.println("playing random Ads");
    }
    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", likes=" + likes +
                ", views=" + views +
                '}';
    }
}
