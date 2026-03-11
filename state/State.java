package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList) {
        rand = new Random();
        this.spellingList = spellingList;
    }

    public String getNextWord() {
        if (words == null) {
            return null;
        }

        return words.get(rand.nextInt(words.size()));
    }

    public abstract void increaseGrade();

    public abstract void decreaseGrade();

}
