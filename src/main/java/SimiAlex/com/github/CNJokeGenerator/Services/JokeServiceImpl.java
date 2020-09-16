package SimiAlex.com.github.CNJokeGenerator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService
{
    // fields
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // constructor
    @Autowired
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    // methods
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
