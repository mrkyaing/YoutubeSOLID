package ISPPractice;

import java.util.ArrayList;
import java.util.List;

public class DoActionMain {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        KMPlayer kmp = new KMPlayer("KMPlayer", "v101");
        players.add(kmp);
        VlcPlayer vlc = new VlcPlayer("VLC", "v103");
        players.add(vlc);
        WimampPlayer wma = new WimampPlayer("wma", "v101");
        players.add(wma);
        for (Player player : players) {
            System.out.println(player);
            player.start();
        }
        //checking the meida
        vlc.playAudio();
        vlc.playVideo();
        kmp.playAudio();
        kmp.playVideo();
        wma.playAudio();
       // wma.playVideo();
    }
}
