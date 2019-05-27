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
            return blackCoffee;

        } else if (type.equals("flat white")) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            return new Coffee(type, coffeeWater, coffeePowder, milk);

        } else if (type.equals("latte")) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            return new Coffee(type, coffeeWater, coffeePowder, milk);
        }
        return null;
    }

}
