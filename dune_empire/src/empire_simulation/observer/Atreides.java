package empire_simulation.observer;

public class Atreides implements BattleObserver{

    @Override
    public void update(BattleState currentState) {
        switch (currentState) {
            case NO_ENEMY:
                System.out.println("The Atreides soldier didn't see any enemy BattleShips.");
                break;
            case FIGHT:
                System.out.println("The Atreides army is fighting.");
                break;
            case LOST:
                System.out.println("Harkonnens won the battle.");
                break;
            case CHANGE_STRATEGY:
                System.out.println("The Atreides strategy need to be changed.");
                break;
            case WIN:
                System.out.println("Atreides army just won the battle.");
                break;
            default:
                break;
        }
    }
}
