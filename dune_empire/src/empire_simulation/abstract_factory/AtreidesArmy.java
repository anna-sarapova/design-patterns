package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.Army;

public class AtreidesArmy implements Army {
    static final String DESCRIPTION = "This is the Atreides Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
