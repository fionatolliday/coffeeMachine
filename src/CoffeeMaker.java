
public class CoffeeMaker {


    private WaterDispenser waterDispenser;
    private MilkDispenser milkDispenser;
    private CoffeePowderDispenser coffeePowderDispenser;


    public CoffeeMaker(WaterDispenser waterDispenser, MilkDispenser milkDispenser,
                       CoffeePowderDispenser coffeePowderDispenser) {
        this.waterDispenser = waterDispenser;
        this.coffeePowderDispenser = coffeePowderDispenser;
        this.milkDispenser = milkDispenser;
    }

    public boolean checkIfIngredientsAvailable(int water, int coffee, int milk) {
        int coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
        int waterLevel = waterDispenser.getWaterLevel();
        int milkLevel = milkDispenser.getMilkLevel();

        return coffeePowderLevel >= coffee && waterLevel >= water && milkLevel >= milk;
    }


    public Coffee makeCoffee(String type) {
        int milk;
        int coffeePowder;
        int coffeeWater;

        if (type.equals("black coffee") && checkIfIngredientsAvailable(40, 15, 0)) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            return new Coffee(type, milk, coffeePowder, coffeeWater);


        } else if (type.equals("flat white") && checkIfIngredientsAvailable(30, 8, 10)) {
            milk = milkDispenser.getMilk(10);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
            coffeeWater = waterDispenser.getWater(30);
            return new Coffee(type, milk, coffeePowder, coffeeWater);


        } else if (type.equals("latte") && checkIfIngredientsAvailable(20, 8, 20)) {
            milk = milkDispenser.getMilk(20);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
            coffeeWater = waterDispenser.getWater(20);
            return new Coffee(type, milk, coffeePowder, coffeeWater);

        }
        return null;
    }

}
