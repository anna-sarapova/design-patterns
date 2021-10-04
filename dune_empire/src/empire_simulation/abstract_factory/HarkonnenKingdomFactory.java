package empire_simulation.abstract_factory;

import empire_simulation.abstract_factory.*;

public class HarkonnenKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new HarkonnenCastle();
    }
    public King createKing() {
        return new HarkonnenKing();
    }
    public Army createArmy() {
        return new HarkonnenArmy();
    }
}
