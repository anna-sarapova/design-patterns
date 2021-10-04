package empire_simulation.builder;

public enum Profession {
    KwisatzHaderach, WARRIOR, VILLAIN, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
