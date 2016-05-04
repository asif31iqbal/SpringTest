package soundsystem;

import org.springframework.stereotype.Component;

@Component("discOne")
public class DiscOne implements CompactDisc {
    private String title = "Disc one";
    private String artist = "Asif Iqbal";
    
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
