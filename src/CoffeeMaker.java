public class CoffeeMaker {
    WaterDispenser waterDispenser = new WaterDispenser();
    MilkDispenser milkDispenser = new MilkDispenser();
    CoffeePowderDispenser coffeePowderDispenser = new CoffeePowderDispenser();

    public Coffee makeCoffee(String type) {
        int milk;
        int coffeePowder;
        int coffeeWater;
        if (type.equals("black coffee")) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            new Coffee(type, coffeeWater, coffeePowder, milk);

        } else if (type.equals("flat white")) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            new Coffee(type, coffeeWater, coffeePowder, milk);

        } else if (type.equals("latte")) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            new Coffee(type, coffeeWater, coffeePowder, milk);
        }
        return null;
    }

}
