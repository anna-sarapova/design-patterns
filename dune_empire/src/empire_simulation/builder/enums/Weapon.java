package empire_simulation.builder.enums;

public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW, MAGIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
