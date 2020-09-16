package SimiAlex.com.github.CNJokeGenerator.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfig {

    @Bean
    public ChuckNorrisQuotes quotes()
    {
        return new ChuckNorrisQuotes();   
    }
    
}
