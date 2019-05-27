import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunCoffeeMachine {

    public static void main(String[] args) {


        CoffeeMaker coffeeMaker = new CoffeeMaker();

        List<String> orders = new ArrayList<>();
        orders.add("black coffee");
        orders.add("latte");
        orders.add("flat white");
        orders.add("black coffee");

        for (int i = 0; i < orders.size(); i++) {
            String order = orders.get(i);
            Coffee coffee = coffeeMaker.makeCoffee(order);

            coffee.consume();
            System.out.println("Coffee: " + coffee);
        }
    }
}