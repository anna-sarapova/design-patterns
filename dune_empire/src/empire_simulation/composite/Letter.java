package empire_simulation.composite;

public class Letter extends LetterComposite{

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printBefore(){
        System.out.print(c);
    }

    @Override
    protected void printAfter(){
    }
}
