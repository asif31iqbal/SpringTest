package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import soundsystem.config.PlayerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfig.class);
        Player pl = (Player)context.getBean(Player.class);
        pl.getCompactDisc().play();
    }
}
