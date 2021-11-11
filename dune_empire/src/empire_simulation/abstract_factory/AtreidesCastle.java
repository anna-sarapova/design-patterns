package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.Castle;

public class AtreidesCastle implements Castle {
    static final String DESCRIPTION = "This is the Atreides' castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
