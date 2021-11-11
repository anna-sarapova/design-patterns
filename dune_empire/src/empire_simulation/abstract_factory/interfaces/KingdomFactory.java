package empire_simulation.abstract_factory.interfaces;

import empire_simulation.abstract_factory.interfaces.Army;
import empire_simulation.abstract_factory.interfaces.Castle;
import empire_simulation.abstract_factory.interfaces.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
