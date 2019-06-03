
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

    public boolean checkIfIngredientsAvailableForBlack(){
        int coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
        int waterLevel = waterDispenser.getWaterLevel();

        return coffeePowderLevel >= 15 && waterLevel >= 40;
    }

    public boolean checkIfIngredientsAvailableForFlat(){
        int coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
        int waterLevel = waterDispenser.getWaterLevel();
        int milkLevel = milkDispenser.getMilkLevel();

        return coffeePowderLevel >= 8 && waterLevel >= 30 && milkLevel >= 40;
    }

    public boolean checkIfIngredientsAvailableForLatte(){

        int coffeePowderLevel = coffeePowderDispenser.getCoffeePowderLevel();
        int waterLevel = waterDispenser.getWaterLevel();
        int milkLevel = milkDispenser.getMilkLevel();

        return coffeePowderLevel >= 8 && waterLevel >= 20 && milkLevel >= 20;
    }



    public Coffee makeCoffee(String type) {
        int milk;
        int coffeePowder;
        int coffeeWater;

        if (type.equals("black coffee") && checkIfIngredientsAvailableForBlack()) {
            milk = milkDispenser.getMilk(0);
            coffeePowder = coffeePowderDispenser.getCoffeePowder(15);
            coffeeWater = waterDispenser.getWater(40);
            return new Coffee(type, milk, coffeePowder, coffeeWater);



        } else if (type.equals("flat white") && checkIfIngredientsAvailableForFlat()) {
                milk = milkDispenser.getMilk(10);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
                coffeeWater = waterDispenser.getWater(30);
            return new Coffee(type, milk, coffeePowder, coffeeWater);



        } else if (type.equals("latte") && checkIfIngredientsAvailableForLatte()) {
                milk = milkDispenser.getMilk(20);
                coffeePowder = coffeePowderDispenser.getCoffeePowder(8);
                coffeeWater = waterDispenser.getWater(20);
            return new Coffee(type, milk, coffeePowder, coffeeWater);

        }
        return null;
    }

}
