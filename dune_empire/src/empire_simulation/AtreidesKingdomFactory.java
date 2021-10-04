package empire_simulation;

public class AtreidesKingdomFactory implements KingdomFactory{
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
