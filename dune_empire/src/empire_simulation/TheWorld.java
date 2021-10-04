package empire_simulation;

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


    }
}
