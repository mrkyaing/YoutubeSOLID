package LSPPractice;

import java.util.ArrayList;
import java.util.List;

public class DoActionMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,SOLID principle in SE");
         VideoManager videoManager=new VideoManager("Liskov Substitution Principle", 3000, 300, 700);
         Video freeVideo=new Video(videoManager);
        System.out.println(freeVideo);
        System.out.println("Played Hours:"+freeVideo.getNumberofHoursPlayed());
        freeVideo.playRandomAds();
        System.out.println("==============================");
        videoManager=new VideoManager("Software Engineering", 300, 150, 350);
        PremiumVideo premiumVideo=new PremiumVideo(videoManager,101);
        System.out.println(premiumVideo);
        System.out.println("Played Hours:"+premiumVideo.getNumberofHoursPlayed());
        premiumVideo.downloadWithHDFormat();
    }
}