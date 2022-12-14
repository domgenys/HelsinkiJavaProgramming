
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Genys.D
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public  JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random randomDraw = new Random();

        int randomIndex = randomDraw.nextInt(jokes.size());

        return jokes.get(randomIndex);
    }
}
