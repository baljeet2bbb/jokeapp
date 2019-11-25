package springframeworkguru.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();


    /*public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
