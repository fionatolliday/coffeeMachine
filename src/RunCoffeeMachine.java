import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunCoffeeMachine {

    List<String> orders;


    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(new WaterDispenser(), new MilkDispenser(),
                new CoffeePowderDispenser());


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
                Coffee coffee = coffeeMaker.makeCoffee(order);
            }

//            coffee.consume();
//            System.out.println("Coffee: " + coffee.type);

    }
}