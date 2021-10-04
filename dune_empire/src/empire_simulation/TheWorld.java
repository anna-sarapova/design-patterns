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



    }
}
