import java.util.ArrayList;
import java.util.List;

public class RunCoffeeMachine {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(new WaterDispenser(), new MilkDispenser(),
                new CoffeePowderDispenser());
        Coffee coffee;


        List<String> orders = new ArrayList<>();
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");


        for (int i = 0; i < orders.size(); i++) {
            String order = orders.get(i);

            coffee = coffeeMaker.makeCoffee(order);

            if (coffee == null) {
                System.out.println("Check ingredients");
            } else
                System.out.println("Coffee: " + coffee.type);
        }

//            coffee.consume();
//            System.out.println("Coffee: " + coffee.type);

    }
}