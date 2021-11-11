package empire_simulation.prototype;

import empire_simulation.prototype.abstractions.Beast;
import empire_simulation.prototype.abstractions.Mage;
import empire_simulation.prototype.abstractions.Warlord;

public interface HeroFactory {

    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();

}