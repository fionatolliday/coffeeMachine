public class CoffeeMaker {

Coffee coffee = new Coffee();
RunCoffeeMachine runMachine = new RunCoffeeMachine();

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
            coffee.setMilk(0);
            coffee.setCoffeePowder(15);
            coffee.setWater(40);
        } else if (coffee.getType() == "flat white") {
            coffee.setMilk(10);
            coffee.setCoffeePowder(8);
            coffee.setWater(30);
        } else if (coffee.getType() == "latte") {
            coffee.setMilk(20);
            coffee.setCoffeePowder(8);
            coffee.setWater(20);
        }
        return coffee;
    }

}
