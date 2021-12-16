package empire_simulation.observer;

public class Harkonnens implements BattleObserver{

    @Override
    public void update(BattleState currentState) {
        switch (currentState) {
            case ATTACK:
                System.out.println("The Harkonnens just attacked the Atreides House and killed the king Leto.");
                break;
            case FIGHT:
                System.out.println("The Harkonnes are fighting for the dominance over the Fremens world.");
                break;
            case WIN:
                System.out.println("Harkonen army just won the battle.");
                break;
            case LOST:
                System.out.println("Harkonens just lost the battle.");
                break;
            case RETURN:
                System.out.println("Harkonens are running from the battle field.");
                break;
            default:
                break;
        }
    }
}
