package empire_simulation.observer;

import java.util.ArrayList;
import java.util.List;

public class Battles {

    private BattleState currentState;
    private List<BattleObserver> observers;

    public Battles() {
        observers = new ArrayList<>();
        currentState = BattleState.NO_ENEMY;
    }

    public void addObserver(BattleObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BattleState observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        BattleState[] enumValues = BattleState.values();
        currentState = enumValues[(currentState.ordinal() + 1) % enumValues.length];
        System.out.println("The battle state changed to " + currentState + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (BattleObserver observer : observers) {
            observer.update(currentState);
        }
    }
}
