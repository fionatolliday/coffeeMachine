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
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(2);
        coffeeDispenser.setCoffeePowder(2);
        milkDispenser.setMilk(2);

        CoffeeMaker makeBlackCoffee = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        Coffee actualResult = makeBlackCoffee.makeCoffee("black coffee");

        Assert.assertNull(actualResult);
    }

    @Test
    public void ifOrderIsFlatWhiteReturnFlatWhiteIfIHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(200);
        coffeeDispenser.setCoffeePowder(50);
        milkDispenser.setMilk(100);

        CoffeeMaker makeFlatWhite = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        String expectedResult = "flat white";
        Coffee actualResult = makeFlatWhite.makeCoffee("flat white");

        Assert.assertEquals(expectedResult, actualResult.type);
    }

    @Test
    public void ifOrderIsFlatWhiteReturnNullIfIDoNotHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(2);
        coffeeDispenser.setCoffeePowder(2);
        milkDispenser.setMilk(2);

        CoffeeMaker makeFlatWhite = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        Coffee actualResult = makeFlatWhite.makeCoffee("flat white");

        Assert.assertNull(actualResult);
    }

    @Test
    public void ifOrderIsLatteReturnLatteIfIHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(200);
        coffeeDispenser.setCoffeePowder(50);
        milkDispenser.setMilk(100);

        CoffeeMaker makeLatte= new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        String expectedResult = "latte";
        Coffee actualResult = makeLatte.makeCoffee("latte");

        Assert.assertEquals(expectedResult, actualResult.type);
    }

    @Test
    public void ifOrderIsLatteReturnNullIfIDoNotHaveEnoughIngredients() {
        WaterDispenser waterDispenser = new WaterDispenser();
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        MilkDispenser milkDispenser = new MilkDispenser();

        waterDispenser.setWater(2);
        coffeeDispenser.setCoffeePowder(2);
        milkDispenser.setMilk(2);

        CoffeeMaker makeLatte = new CoffeeMaker(waterDispenser,
                milkDispenser,
                coffeeDispenser);

        Coffee actualResult = makeLatte.makeCoffee("latte");

        Assert.assertNull(actualResult);
    }

}