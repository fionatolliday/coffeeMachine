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


        if (type.equals("black coffee")) {
            try {
                milk = milkDispenser.getMilk(0);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
                coffeeWater = waterDispenser.getWater(40);
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } catch (IllegalArgumentException error) {
                return null;
            }


        } else if (type.equals("flat white")) {
            try {
                milk = milkDispenser.getMilk(10);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
                coffeeWater = waterDispenser.getWater(30);
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } catch (IllegalArgumentException error) {
                return null;
            }


        } else if (type.equals("latte")) {
            try {
                milk = milkDispenser.getMilk(20);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
                coffeeWater = waterDispenser.getWater(20);
                return new Coffee(type, coffeeWater, coffeePowder, milk);
            } catch (IllegalArgumentException error) {
                return null;
            }
        }
        return null;
    }

}
