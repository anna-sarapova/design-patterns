package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.King;

public class AtreidesKing implements King {
    static final String DESCRIPTION = "This is the Atreides king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
