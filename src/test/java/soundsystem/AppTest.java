package soundsystem;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.config.PlayerConfig;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlayerConfig.class)
public class AppTest 
{
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    
    @Autowired
    private CompactDisc cd;
    
    @Autowired
    private MediaPlayer mp;
    
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }    

    @Test
    public void play() {
        mp.play();        
        assertEquals(
        "Playing Disc one by Asif Iqbal\n",
        log.getLog());
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
