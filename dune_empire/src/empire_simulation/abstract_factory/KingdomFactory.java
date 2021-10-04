package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.Army;
import empire_simulation.abstract_factory.Castle;
import empire_simulation.abstract_factory.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
