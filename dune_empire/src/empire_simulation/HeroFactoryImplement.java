package empire_simulation;

public class HeroFactoryImplement implements HeroFactory {

    private Mage mage;
    private Warlord warlord;
    private Beast beast;

    /**
     * Constructor
     */
    public HeroFactoryImplement(Mage mage, Warlord warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    /**
     * Create mage
     */
    public Mage createMage() {
        try {
            return mage.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create warlord
     */
    public Warlord createWarlord() {
        try {
            return warlord.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create beast
     */
    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}