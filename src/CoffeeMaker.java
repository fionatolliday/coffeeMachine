public class CoffeeMaker {


    WaterDispenser waterDispenser;
    MilkDispenser milkDispenser;
    CoffeePowderDispenser coffeePowderDispenser;

    public CoffeeMaker(WaterDispenser waterDispenser, MilkDispenser milkDispenser,
                       CoffeePowderDispenser coffeePowderDispenser){
        this.waterDispenser = waterDispenser;
        this.coffeePowderDispenser = coffeePowderDispenser;
        this.milkDispenser = milkDispenser;
    }



    public Coffee makeCoffee(String type) {
        int milk;
        int coffeePowder;
        int coffeeWater;

            if (type.equals("black coffee")) {
                milk = milkDispenser.getMilk(0);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
                coffeeWater = waterDispenser.getWater(40);
                Coffee blackCoffee = new Coffee(type, coffeeWater, coffeePowder, milk);
                if (milkDispenser.getMilkLevel() > milk && coffeePowderDispenser.getCoffeePowderLevel() > coffeePowder && waterDispenser.getWaterLevel() > coffeeWater) {
                    return blackCoffee;
                } return null;

            } else if (type.equals("flat white")) {
                milk = milkDispenser.getMilk(10);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
                coffeeWater = waterDispenser.getWater(30);
                if (milkDispenser.getMilkLevel() > milk && coffeePowderDispenser.getCoffeePowderLevel() > coffeePowder && waterDispenser.getWaterLevel() > coffeeWater) {
                    return new Coffee(type, coffeeWater, coffeePowder, milk);
                }return null;

            } else if (type.equals("latte")) {
                milk = milkDispenser.getMilk(20);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
                coffeeWater = waterDispenser.getWater(20);
                if (milkDispenser.getMilkLevel() > milk && coffeePowderDispenser.getCoffeePowderLevel() > coffeePowder && waterDispenser.getWaterLevel() > coffeeWater) {
                    return new Coffee(type, coffeeWater, coffeePowder, milk);
                } return null;


        } return null;
    }

}
