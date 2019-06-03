import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

    private WaterDispenser waterDispenser;
    private MilkDispenser milkDispenser;
    private CoffeePowderDispenser coffeePowderDispenser;
    private CoffeeMaker coffeeMaker;

    @Before
    public void setUp() throws Exception {
        waterDispenser = new WaterDispenser();

        coffeeMaker = new CoffeeMaker(new WaterDispenser(), new MilkDispenser(), new CoffeePowderDispenser());
    }
    

    @Test
    public void iHaveEnoughIngredientsForAnyCoffee() {
        WaterDispenser waterDispenser = new WaterDispenser();
        waterDispenser.setWater(200);
        MilkDispenser milkDispenser = new MilkDispenser();
        milkDispenser.setMilk(100);
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        coffeeDispenser.setCoffeePowder(50);


        CoffeeMaker notEnoughIngredients = new CoffeeMaker(waterDispenser, milkDispenser,
                coffeeDispenser);

        boolean expected = true;
        boolean actual = notEnoughIngredients.checkIfIngredientsAvailable(40, 15, 20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iDoNotHaveEnoughIngredientsForAnyCoffee() {
        WaterDispenser waterDispenser = new WaterDispenser();
        waterDispenser.setWater(2);
        MilkDispenser milkDispenser = new MilkDispenser();
        milkDispenser.setMilk(200);
        CoffeePowderDispenser coffeeDispenser = new CoffeePowderDispenser();
        coffeeDispenser.setCoffeePowder(200);


        CoffeeMaker notEnoughIngredients = new CoffeeMaker(waterDispenser, milkDispenser,
                coffeeDispenser);

        boolean expected = false;
        boolean actual = notEnoughIngredients.checkIfIngredientsAvailable(40, 15, 0);

        Assert.assertEquals(expected, actual);
    }

}