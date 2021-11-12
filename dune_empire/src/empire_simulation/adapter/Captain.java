package empire_simulation.adapter;

import empire_simulation.adapter.interfaces.DragonFly;

/** The Captain class is the client in the pattern **/

public class Captain implements DragonFly {

    private DragonFly dragonFly;

    public Captain() {

    }

    public Captain(DragonFly dragonFly) {
        this.dragonFly = dragonFly;
    }

    public void setBattleship(DragonFly dragonFly) {
        this.dragonFly = dragonFly;
    }

    @Override
    public void attack() {
        dragonFly.attack();
    }

    @Override
    public void transport() {
        dragonFly.transport();
    }
}
