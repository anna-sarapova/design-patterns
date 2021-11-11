package empire_simulation.prototype;

import empire_simulation.prototype.abstractions.Warlord;

public class Fremen extends Warlord {
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
