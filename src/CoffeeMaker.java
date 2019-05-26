public class CoffeeMaker {

private Coffee coffee = new Coffee();
WaterDispenser water = new WaterDispenser();
MilkDispenser milk = new MilkDispenser();
CoffeePowderDispenser coffeePowder = new CoffeePowderDispenser();

    public String whatType(String type) {
        if (type.equals("flat white")) {

            return "Making you a flat white.";
        }
        if (type.equals("latte")) {
            return "Making you a latte.";
        }
        if (type.equals("black coffee")) {
            return "Making you a black coffee.";
        }
        return null;
    }


    public String makeCoffee(String type) {
        if (type.equals("black coffee")) {
            water.getWater(20);
            milk.getMilk(0);
            coffeePowder.getCoffeePowder(15);
            return "Making you a black coffee";

        } else if (type.equals("flat white")) {
            milk.getMilk(10);
            coffeePowder.getCoffeePowder(8);
            water.getWater(30);
            return "Making you a flat white";

        } else if (type.equals("latte")) {
            milk.getMilk(20);
            coffeePowder.getCoffeePowder(8);
            water.getWater(20);
            return "Making you a latte";
        }
        return null;
    }

}
