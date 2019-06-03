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
        coffeeMaker = new CoffeeMaker(new WaterDispenser(), new MilkDispenser(), new CoffeePowderDispenser());
    }



    @Test
    public void iHaveEnoughIngredientsForABlackCoffee() {
        boolean actual = true;
        boolean expected = coffeeMaker.checkIfIngredientsAvailableForBlack();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void iHaveEnoughIngredientsForAFlatWhiteCoffee() {
        boolean actual = true;
        boolean expected = coffeeMaker.checkIfIngredientsAvailableForFlat();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void iHaveEnoughIngredientsForALatteCoffee() {
        boolean actual = true;
        boolean expected = coffeeMaker.checkIfIngredientsAvailableForLatte();

        Assert.assertEquals(actual, expected);

    }
}