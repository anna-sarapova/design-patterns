package empire_simulation.abstract_factory;

public class AtreidesKing implements King {
    static final String DESCRIPTION = "This is the Atreides king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
