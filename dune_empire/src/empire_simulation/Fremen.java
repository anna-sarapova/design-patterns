package empire_simulation;

public class Fremen extends Warlord{
    public Fremen() {}

    @Override
    public Warlord clone() throws CloneNotSupportedException {
        return new Fremen();
    }

    @Override
    public String toString() {
        return "The best Fremen Warrior";
    }
}
