import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMakerTest {

    @Test
    public void checkIfIngredientsAvailableReturnsTrueWhenIHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(200);
        coffeeDispenser.setCoffeePowder(50);
        milkDispenser.setMilk(100);

        CoffeeMaker coffeeMakerWithEnoughIngredients = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        boolean actualResult = coffeeMakerWithEnoughIngredients.checkIfIngredientsAvailable(40, 15,
                20);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkIfIngredientsAvailableReturnsFalseWhenIDoNotHaveEnoughIngredients(){
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(2);
        coffeeDispenser.setCoffeePowder(2);
        milkDispenser.setMilk(2);

        CoffeeMaker coffeeMakerWithEnoughIngredients = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        boolean actualResult = coffeeMakerWithEnoughIngredients.checkIfIngredientsAvailable(40, 15,
                20);

        Assert.assertFalse(actualResult);
    }

    @Test
    public void ifOrderIsBlackCoffeeReturnBlackCoffeeIfIHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(200);
        coffeeDispenser.setCoffeePowder(50);
        milkDispenser.setMilk(100);

        CoffeeMaker makeBlackCoffee = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        String expectedResult = "black coffee";
        Coffee actualResult = makeBlackCoffee.makeCoffee("black coffee");

        Assert.assertEquals(expectedResult, actualResult.type);
    }

    @Test
    public void ifOrderIsBlackCoffeeReturnNullIfIDoNotHaveEnoughIngredients() {
        
    }

}