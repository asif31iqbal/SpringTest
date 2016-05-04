package soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import soundsystem.CompactDisc;
import soundsystem.DiscOne;

@Configuration
//@ComponentScan(basePackages="soundsystem")
public class PlayerConfig {
    @Bean(name="discOne")
    public CompactDisc dicsOne() {
        return new DiscOne();
    }
}
