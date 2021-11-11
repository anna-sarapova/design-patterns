package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.Castle;

public class HarkonnenCastle implements Castle {
    static final String DESCRIPTION = "This is the Harkonnen' castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
