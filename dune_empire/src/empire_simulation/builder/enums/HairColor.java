package empire_simulation.builder.enums;

public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
