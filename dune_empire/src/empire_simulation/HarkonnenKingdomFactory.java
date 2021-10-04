package empire_simulation;

public class HarkonnenKingdomFactory implements KingdomFactory{
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
