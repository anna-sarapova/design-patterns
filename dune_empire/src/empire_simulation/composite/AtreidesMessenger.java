package empire_simulation.composite;

import empire_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtreidesMessenger {

    public LetterComposite messageFromAtreides(){

        List<Word> words = new ArrayList<>();

        // "We will protect the planet of Fremens"
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('p'), new Letter('r'), new Letter('o'), new Letter('t'), new Letter('e'), new Letter('c'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('p'), new Letter('l'), new Letter('a'), new Letter('n'), new Letter('e'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('o'), new Letter('f'))));
        words.add(new Word(Arrays.asList(new Letter('F'), new Letter('r'), new Letter('e'), new Letter('m'), new Letter('e'), new Letter('n'), new Letter('s'))));

        return new Sentence(words);
    }
}
