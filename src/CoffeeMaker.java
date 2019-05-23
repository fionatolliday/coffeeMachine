public class CoffeeMaker {

Coffee coffee = new Coffee();
RunCoffeeMachine runMachine = new RunCoffeeMachine();
WaterDispenser water = new WaterDispenser();
MilkDispenser milk = new MilkDispenser();
CoffeePowderDispenser coffeePowder = new CoffeePowderDispenser();

   public String whatType() {
        if (runMachine.readUserInput.equals("flat white")) {

            return "Making you a flat white.";
        }
        if (runMachine.readUserInput.equals("latte")) {
            return "Making you a latte.";
        }
        if (runMachine.readUserInput.equals("black coffee")) {
            return "Making you a black coffee.";
        }
        return null;
    }



    public Coffee makeCoffee(String type) {
        if (coffee.getType() == "black coffee") {
            water.getWater(40);
            milk.getMilk(0);
            coffeePowder.getCoffeePowder(15);
        } else if (coffee.getType() == "flat white") {
            milk.getMilk(10);
            coffeePowder.getCoffeePowder(8);
            water.getWater(30);
        } else if (coffee.getType() == "latte") {
            milk.getMilk(20);
            coffeePowder.getCoffeePowder(8);
            water.getWater(20);
        }
        return coffee;
    }

}
