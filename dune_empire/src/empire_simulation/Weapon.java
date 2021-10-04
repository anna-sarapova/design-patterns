package empire_simulation;

public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW, MAGIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
