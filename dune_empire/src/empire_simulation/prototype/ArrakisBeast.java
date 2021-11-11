package empire_simulation.prototype;

import empire_simulation.prototype.abstractions.Beast;

public class ArrakisBeast extends Beast {
    public ArrakisBeast() {}

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new ArrakisBeast();
    }

    @Override
    public String toString() {
        return "Devil! The giant Sandworm!!! ";
    }

}
