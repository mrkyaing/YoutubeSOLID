import java.util.ArrayList;
import java.util.List;

public class DoActionMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,SOLID principle in SE");
        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Liskov Substitution Principle", 3000, 300, 700));
        videos.add(new PremiumVideo("Software Engineering", 300, 150, 350, 103));
        for (Video video : videos) {
            System.out.println(video);
            System.out.println("Played Hours:"+video.getNumberofHoursPlayed());
            video.playRandomAds();
        }
    }
}