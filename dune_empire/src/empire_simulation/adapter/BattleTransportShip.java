package empire_simulation.adapter;

import empire_simulation.adapter.interfaces.DragonFly;

public class BattleTransportShip  implements DragonFly {

    private TransportShip ship;

    public BattleTransportShip(){
        ship = new TransportShip();
    }

    @Override
    public void attack(){
        System.out.println("Attack the ship!");
    }

    @Override
    public void transport(){
        ship.move();
    }
}
