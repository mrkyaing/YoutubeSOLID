public class Video {
    private String title;
    private int time,likes,views;

    public Video(String title, int time, int likes, int views) {
        this.title = title;
        this.time = time;
        this.likes = likes;
        this.views = views;
    }

    public double getNumberofHoursPlayed(){
        return (time/3600.00)*views;
    }
    public void playRandomAds() throws Exception{
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
