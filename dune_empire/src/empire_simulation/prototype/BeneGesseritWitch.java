package empire_simulation.prototype;

import empire_simulation.prototype.abstractions.Mage;

public class BeneGesseritWitch extends Mage {
    public BeneGesseritWitch() {}

    @Override
    public Mage clone() throws CloneNotSupportedException {
        return new BeneGesseritWitch();
    }

    @Override
    public String toString() {
        return "Bene Gesserit Witch";
    }
}
