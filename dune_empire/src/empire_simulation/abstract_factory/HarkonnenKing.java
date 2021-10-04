package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.King;

public class HarkonnenKing implements King {
    static final String DESCRIPTION = "This is the Harkonnen king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
