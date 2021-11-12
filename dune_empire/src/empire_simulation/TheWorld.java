package empire_simulation;

import empire_simulation.abstract_factory.AtreidesKingdomFactory;
import empire_simulation.abstract_factory.HarkonnenKingdomFactory;
import empire_simulation.adapter.BattleTransportShip;
import empire_simulation.adapter.Captain;
import empire_simulation.builder.*;
import empire_simulation.builder.enums.*;
import empire_simulation.composite.AtreidesMessenger;
import empire_simulation.composite.HarkonnenMessenger;
import empire_simulation.composite.abstractions.LetterComposite;
import empire_simulation.prototype.*;
import empire_simulation.prototype.abstractions.Beast;
import empire_simulation.prototype.abstractions.Mage;
import empire_simulation.prototype.abstractions.Warlord;
import empire_simulation.proxy.FlyingShipProxy;
import empire_simulation.proxy.People;

public class TheWorld {
    public static void main(String[] args){
        var factory = new AtreidesKingdomFactory();
        var castle = factory.createCastle();
        var king = factory.createKing();
        var army = factory.createArmy();

        var house2 = new HarkonnenKingdomFactory();
        var castle2 = house2.createCastle();
        var king2 = house2.createKing();
        var army2 = house2.createArmy();

        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

        System.out.println(castle2.getDescription());
        System.out.println(king2.getDescription());
        System.out.println(army2.getDescription());

        System.out.println("__________________________________________________________");

        Hero warrior =
                new Hero.Builder(Profession.WARRIOR, "Duncan Idaho")
                        .withHairType(HairType.BALD).withWeapon(Weapon.DAGGER).build();
        System.out.println(warrior);

        Hero  kwisatzHaderach =
                new Hero.Builder(Profession.KwisatzHaderach, "Paul Atreides").withHairColor(HairColor.BLACK)
                        .withHairType(HairType.LONG_CURLY).withArmor(Armor.PLATE_MAIL).withWeapon(Weapon.SWORD)
                        .build();
        System.out.println(kwisatzHaderach);

        Hero villain =
                new Hero.Builder(Profession.VILLAIN, "Baron Vladimir Harkonnen").withHairType(HairType.BALD)
                        .withWeapon(Weapon.MAGIC).build();
        System.out.println(villain);

        System.out.println("__________________________________________________________");

        HeroFactory secondaryCharacters;
        Mage mage;
        Warlord warlord;
        Beast beast;

        secondaryCharacters = new HeroFactoryImplement(new BeneGesseritWitch(),new Fremen(), new ArrakisBeast());
        mage = secondaryCharacters.createMage();
        warlord = secondaryCharacters.createWarlord();
        beast = secondaryCharacters.createBeast();
        System.out.println(mage);
        System.out.println(warlord);
        System.out.println(beast);

        System.out.println("__________________________________________________________");

        Captain captain = new Captain((new BattleTransportShip()));
        captain.transport();
        captain.attack();

        System.out.println("__________________________________________________________");

        FlyingShipProxy ship = new FlyingShipProxy();
        ship.onBoard(new People("Group A"));
        ship.onBoard(new People("Group B"));
        ship.onBoard(new People("Group C"));
        ship.onBoard(new People("Group D"));
        ship.onBoard(new People("Group E"));
        ship.onBoard(new People("Group F"));
        ship.onBoard(new People("Group G"));
        ship.onBoard(new People("Group H"));
        ship.onBoard(new People("Group I"));

        System.out.println("__________________________________________________________");

        System.out.println(" The Harkonnens say: ");

        LetterComposite harkonnenMessage = new HarkonnenMessenger().messageFromHarkonnens();
        harkonnenMessage.print();

        System.out.println("\n");

        System.out.println(" The Atreides say: ");
        LetterComposite atreidesMessage = new AtreidesMessenger().messageFromAtreides();
        atreidesMessage.print();

    }
}
