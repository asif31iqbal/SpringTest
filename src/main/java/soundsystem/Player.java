package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player implements MediaPlayer{
    private CompactDisc cd;
    
    @Autowired
    public Player(CompactDisc cd) {
        this.cd = cd;
    }
    
    public void play() {
        cd.play();
    }
    
    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }
    
    public CompactDisc getCompactDisc() {
        return cd;
    }
}
