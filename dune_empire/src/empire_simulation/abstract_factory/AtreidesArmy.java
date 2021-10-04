package empire_simulation.abstract_factory;

public class AtreidesArmy implements Army {
    static final String DESCRIPTION = "This is the Atreides Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
