public class CoffeeMaker {


    WaterDispenser waterDispenser;
    MilkDispenser milkDispenser;
    CoffeePowderDispenser coffeePowderDispenser;


    public CoffeeMaker(WaterDispenser waterDispenser, MilkDispenser milkDispenser,
                       CoffeePowderDispenser coffeePowderDispenser) {
        this.waterDispenser = waterDispenser;
        this.coffeePowderDispenser = coffeePowderDispenser;
        this.milkDispenser = milkDispenser;
    }


    public Coffee makeCoffee(String type) {
        int milk;
        int coffeePowder;
        int coffeeWater;
        int milkLevel;
        int waterLevel;
        int coffeePowderLevel;


        if (type.equals("black coffee")) {
            milk = milkDispenser.getMilk(0);
            milkLevel = milkDispenser.getMilkLevel();
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
            coffeeWater = waterDispenser.getWater(40);
            waterLevel = waterDispenser.getWaterLevel();

            if (milk < milkLevel && coffeePowder < coffeePowderLevel && coffeeWater < waterLevel) {
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } else return null;


        } else if (type.equals("flat white")) {
            milk = milkDispenser.getMilk(10);
            milkLevel = milkDispenser.getMilkLevel();
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
            coffeeWater = waterDispenser.getWater(30);
            waterLevel = waterDispenser.getWaterLevel();
            if (milk < milkLevel && coffeePowder < coffeePowderLevel && coffeeWater < waterLevel) {
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } else return null;


        } else if (type.equals("latte")) {
            milk = milkDispenser.getMilk(20);
            milkLevel = milkDispenser.getMilkLevel();
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
            coffeeWater = waterDispenser.getWater(20);
            waterLevel = waterDispenser.getWaterLevel();
            if (milk < milkLevel && coffeePowder < coffeePowderLevel && coffeeWater < waterLevel) {
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } else return null;
        }
        return null;
    }

}
