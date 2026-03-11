import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private static FlashCards flashCards;
    private Random rand;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards() {
        words = FileReader.getWords();
        rand = new Random();
    }

    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    public Word getWord() {
        int index = rand.nextInt(words.size());
        Word word = words.get(index);
        words.remove(index);
        return word;

    }
}
