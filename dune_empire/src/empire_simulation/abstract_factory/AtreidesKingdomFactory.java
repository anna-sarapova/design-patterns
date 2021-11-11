package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.interfaces.Army;
import empire_simulation.abstract_factory.interfaces.Castle;
import empire_simulation.abstract_factory.interfaces.King;
import empire_simulation.abstract_factory.interfaces.KingdomFactory;

public class AtreidesKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new AtreidesCastle();
    }
    public King createKing() {
        return new AtreidesKing();
    }
    public Army createArmy() {
        return new AtreidesArmy();
    }
}
