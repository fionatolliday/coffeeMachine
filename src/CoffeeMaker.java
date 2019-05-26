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


    public Coffee makeCoffee(String type) {
        if (type.equals("black coffee")) {
            water.getWater(250);
            milk.getMilk(0);
            coffeePowder.getCoffeePowder(15);
        } else if (type.equals("flat white")) {
            milk.getMilk(10);
            coffeePowder.getCoffeePowder(8);
            water.getWater(30);
        } else if (type.equals("latte")) {
            milk.getMilk(20);
            coffeePowder.getCoffeePowder(8);
            water.getWater(20);
        }
        return coffee;
    }

}
