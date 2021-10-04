package empire_simulation.abstract_factory;

public class AtreidesCastle implements Castle {
    static final String DESCRIPTION = "This is the Atreides' castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
