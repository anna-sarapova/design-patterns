package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.Army;

public class HarkonnenArmy implements Army {
    static final String DESCRIPTION = "This is the Harkonnen Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
