import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RefactoredCoffeeMakerTest {

    private CoffeeMaker coffeeMaker;
    private WaterDispenser waterDispenser;
    private MilkDispenser milkDispenser;
    private CoffeePowderDispenser coffeePowderDispenser;

    @Before
    public void setUp() throws Exception {
         waterDispenser = new WaterDispenser();
         milkDispenser = new MilkDispenser();
         coffeePowderDispenser = new CoffeePowderDispenser();

        coffeeMaker = new CoffeeMaker(waterDispenser,  milkDispenser,
               coffeePowderDispenser);

    }

    @Test
    public void returnTrueIfIngredientsAllAvailableToMakeACoffee() {
        waterDispenser.setWater(200);
        milkDispenser.setMilk(200);
        coffeePowderDispenser.setCoffeePowder(200);

//        coffeeMaker.checkIfIngredientsAvailable(20, 20, 20);

        Assert.assertTrue(coffeeMaker.checkIfIngredientsAvailable(20, 20, 20));

    }

    @Test
    public void returnFalseIfIngredientsUnavailableToMakeACoffee() {
        waterDispenser.setWater(2);
        milkDispenser.setMilk(2);
        coffeePowderDispenser.setCoffeePowder(2);

        Assert.assertFalse(coffeeMaker.checkIfIngredientsAvailable(20, 20, 20));
    }

    @Test
    public void returnsBlackCoffeeIfIngredientsAllAvailable() {
        waterDispenser.setWater(200);
        milkDispenser.setMilk(200);
        coffeePowderDispenser.setCoffeePowder(200);

        Coffee actualResult = coffeeMaker.makeCoffee("black coffee");

        Assert.assertEquals("black coffee", actualResult.type);
    }

    @Test
    public void returnsNullToABlackCoffeeIfIngredientsNotAllAvailable() {
        waterDispenser.setWater(2);
        milkDispenser.setMilk(2);
        coffeePowderDispenser.setCoffeePowder(2);

        Coffee actualResult = coffeeMaker.makeCoffee("black coffee");

        Assert.assertNull(actualResult);
    }
}
