package empire_simulation.composite;

import empire_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HarkonnenMessenger {

    public LetterComposite messageFromHarkonnens(){

        List<Word> words = new ArrayList<>();

        // "We will return our planet and dominance"
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('r'), new Letter('e'), new Letter('t'), new Letter('u'), new Letter('r'), new Letter('n'))));
        words.add(new Word(Arrays.asList(new Letter('o'), new Letter('u'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('p'), new Letter('l'), new Letter('a'), new Letter('n'), new Letter('e'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('a'), new Letter('n'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('o'), new Letter('m'), new Letter('i'), new Letter('n'), new Letter('a'), new Letter('n'), new Letter('c'), new Letter('e'))));

        return new Sentence(words);
    }
}
